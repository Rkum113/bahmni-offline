package com.bahmni.offline;

import android.os.Bundle;

import org.apache.cordova.CordovaActivity;
import org.xwalk.core.XWalkPreferences;
import org.xwalk.core.XWalkView;

public class MainActivity extends CordovaActivity
{
    private XWalkView xWalkWebView;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xWalkWebView=(XWalkView)findViewById(R.id.xwalkWebView);
        xWalkWebView.addJavascriptInterface(new WebAppInterface(MainActivity.this), "Android");
        xWalkWebView.load(launchUrl, null);
        // turn on debugging
        XWalkPreferences.setValue(XWalkPreferences.REMOTE_DEBUGGING, true);
    }


}
