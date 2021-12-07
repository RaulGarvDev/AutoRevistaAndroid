package com.versys.autorevista;


import android.annotation.SuppressLint;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class MainActivity extends AppCompatActivity {

    private WebView webView;
    private String url;
    private WebSettings webSettings;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        url = "https://www.auto-revista.com/";
        webView = findViewById(R.id.webview);
        webSettings = webView.getSettings ();

        webView.setWebViewClient(new WebViewClient());





        webSettings.setJavaScriptEnabled (true);
        webSettings.setUseWideViewPort (true);
        webSettings.setLoadWithOverviewMode (true);
        webSettings.setCacheMode (WebSettings.LOAD_NO_CACHE);




        webView.loadUrl(url);





    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }



}