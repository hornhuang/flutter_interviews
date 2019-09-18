package com.example.drop.classes;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.Fragment;

import com.example.drop.BookFragment;
import com.example.drop.fragment.ChatFragment;
import com.example.drop.fragment.HomeFragment;
import com.example.drop.R;
import com.example.drop.WorldFragment;


public class Home extends AppCompatActivity implements View.OnClickListener{

    WorldFragment worldFragment = new WorldFragment();

    ChatFragment chatFragment = new ChatFragment();

    BookFragment bookFragment = new BookFragment();

    HomeFragment homeFragment = new HomeFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        replaceFragment(new WorldFragment());


        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button_3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button_4);
        button4.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_1:
                replaceFragment(worldFragment);
                break;
            case R.id.button_2:

                replaceFragment(chatFragment);
                break;
            case R.id.button_3:
                replaceFragment(bookFragment);
                break;
            case R.id.button_4:
                replaceFragment(homeFragment);
                break;
            default:
                break;
        }
    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.center_fragment,fragment);
        transaction.commit();
    }

    @Override
    public void onResume(){
        super.onResume();
    }

    @Override
    public void onStop(){
        super.onStop();
    }

//    @Override
//    public void onDestroyView(){
//        super.onDestroyView();
//    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }
//    @Override
//    public void onDatach(){
//        super.onDatach();
//    }


}