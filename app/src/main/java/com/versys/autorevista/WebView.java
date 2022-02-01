package com.versys.autorevista;


import android.annotation.SuppressLint;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

import com.onesignal.OneSignal;


public class WebView extends AppCompatActivity {

    private android.webkit.WebView webView;
    private String url;
    private WebSettings webSettings;
    private static final String one = "90c87cdd-57c1-4dca-806e-ef31a4c1cd03";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization

        OneSignal.initWithContext(this);
        OneSignal.setAppId(one);


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