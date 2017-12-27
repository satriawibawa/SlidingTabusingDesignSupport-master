package com.androidbie.slidingtabsupportdesign.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.androidbie.slidingtabsupportdesign.MainActivity;
import com.androidbie.slidingtabsupportdesign.R;


public class TK extends Fragment {

    private WebView web;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tk, container, false);
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
        web.loadUrl("https://tk.akakom.ac.id");
    }
}
