package com.androidbie.slidingtabsupportdesign.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.androidbie.slidingtabsupportdesign.MainActivity;
import com.androidbie.slidingtabsupportdesign.R;


public class KA extends Fragment {

    private WebView web;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.ka, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        web = (WebView) view.findViewById(R.id.webViewApp);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient() {
            public boolean shoulOverrideUrlLoading(WebView alamat, String url) {
                alamat.loadUrl(url);
                return super.shouldOverrideUrlLoading(alamat, url);
            }
        });
        web.loadUrl("https://ka.akakom.ac.id");
    }
}
