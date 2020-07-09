package com.quiz.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    WebView web_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        web_page = (WebView)findViewById(R.id.web_page);
        WebSettings ws = web_page.getSettings();
        ws.setJavaScriptEnabled(true);

        web_page.loadUrl("https://www.youtube.com/channel/UCyROTH_68poaqtO4Mwi9ELQ/");
        web_page.setWebViewClient(new WebViewClient());
    }

    public void onBackPressed() {
        if (web_page.canGoBack()) {
            web_page.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
