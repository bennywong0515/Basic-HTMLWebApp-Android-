package com.benny.htmlwebapp;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class JavaScriptInterface {
    private Activity activity;
    public JavaScriptInterface(Activity activiy) {
        this.activity = activiy;
    }
    @JavascriptInterface
    public void showToast(){
        Toast.makeText(activity, "Testing", Toast.LENGTH_SHORT).show();
    }
}
