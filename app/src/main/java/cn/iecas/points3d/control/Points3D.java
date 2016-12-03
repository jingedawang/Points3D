package cn.iecas.points3d.control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;

import cn.iecas.points3d.R;

/**
 * Created by wjg on 2016/12/2.
 */

public class Points3D extends LinearLayout {

    WebView webview;

    public Points3D(Context context, AttributeSet attrs) {
        super(context, attrs);

        //inflate from xml
        LayoutInflater.from(context).inflate(R.layout.points3d, this);

        webview = (WebView) findViewById(R.id.webView);

        webview.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        //启用支持javascript
        WebSettings settings = webview.getSettings();
        settings.setJavaScriptEnabled(true);

        webview.loadUrl("file:///android_asset/3DPoints.html");

        //TODO:

    }

    public Line addLine() {
        //TODO:

        return new Line();
    }



}
