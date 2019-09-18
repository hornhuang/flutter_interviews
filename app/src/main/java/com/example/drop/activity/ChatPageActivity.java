package com.example.drop.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.drop.classes.Msg;
import com.example.drop.adapter.MsgAdapter;
import com.example.drop.R;
import com.example.drop.classes.Robot;
import com.google.gson.Gson;


import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatPageActivity extends AppCompatActivity {

    private List<Msg> msgList = new ArrayList<>();

    private EditText inputText;

    private Button send;

    private RecyclerView msgRecyclerView;

    private MsgAdapter adapter;

    private String stringUser;

    private String stringiRobot;

    private Robot robot;

    private int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_page);

        inputText = (EditText) findViewById(R.id.input_text);
        send = (Button) findViewById(R.id.send);
        msgRecyclerView = (RecyclerView) findViewById(R.id.msg_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        msgRecyclerView.setLayoutManager(layoutManager);
        adapter = new MsgAdapter(msgList);
        msgRecyclerView.setAdapter(adapter);
        send.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String content = inputText.getText().toString();
                if (!"".equals(content)){

                    RequestQueue mqueue = Volley.newRequestQueue(ChatPageActivity.this);
                    Map<String,String> params = new HashMap<String, String>();
                    params.put("key","18e048a4c0654b7e9d1d527999bf5e9e");
                    params.put("info",content);
                    params.put("userid","296750");
                    JSONObject jsonObject = new JSONObject(params);
                    JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST,"http://www.tuling123.com/openapi/api" , jsonObject,
                            new Response.Listener<JSONObject>() {
                                @Override
                                public void onResponse(JSONObject response) {
                                    Gson gson = new Gson();
                                    robot =gson.fromJson(response.toString(),Robot.class);
                                    stringiRobot = (String)  robot.getText();
                                    Msg msg2 = new Msg(stringiRobot,Msg.TYPE_RECEIVED);
                                    msgList.add(msg2);
                                    adapter.notifyItemInserted(msgList.size()-1);
                                    msgRecyclerView.scrollToPosition(msgList.size()-1);
                                    inputText.setText("");
                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Log.i("TAG", error.getMessage(), error);
                        }
                    });
                    Msg msg = new Msg(content,Msg.TYPE_SENT);
                    msgList.add(msg);
                    mqueue.add(jsonObjectRequest);
                    adapter.notifyItemInserted(msgList.size()-1);
                    msgRecyclerView.scrollToPosition(msgList.size()-1);
                    inputText.setText("");


                }
            }
        });
    }



}
