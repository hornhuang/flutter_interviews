package com.example.drop.classes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.drop.R;

public class WebBook extends AppCompatActivity {

    private String URI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);
        WebView webView = (WebView) findViewById(R.id.view_web);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        URI = "https://www.amazon.cn/s/ref=nb_sb_ss_i_2_9/461-5115720-8747102?__mk_zh_CN=%E4%BA%9A%E9%A9%AC%E9%80%8A%E7%BD%91%E7%AB%99&url=search-alias%3Daps&field-keywords=%E6%B5%B7%E6%B0%B4%E9%B1%BC%E5%9B%BE%E9%89%B4&sprefix="
                + name + "%2Caps%2C148&crid=115Y6JWK1RSDX\n";
        webView.loadUrl(URI);

    }
}
