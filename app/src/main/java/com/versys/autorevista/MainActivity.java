package com.versys.autorevista;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String url = "https://www.auto-revista.com/";
        WebView webView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings ();

        webView.setWebViewClient(new WebViewClient());





        webSettings.setJavaScriptEnabled (true);
        webSettings.setUseWideViewPort (true);
        webSettings.setLoadWithOverviewMode (true);
        webSettings.setCacheMode (WebSettings.LOAD_NO_CACHE);

        webView.loadUrl(url);


       if (webView.canGoBack()) {
            webView.goBack();
        } else {
            webView.getOriginalUrl();
        }


    }



}