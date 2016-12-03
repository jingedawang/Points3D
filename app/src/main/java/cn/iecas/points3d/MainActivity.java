package cn.iecas.points3d;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import cn.iecas.points3d.control.Line;
import cn.iecas.points3d.control.Points3D;

import static android.R.attr.x;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //用户代码示例
        Points3D points3D = (Points3D) findViewById(R.id.points3d);
        Line l = points3D.addLine();
        l.addPoint(1, 2, 3);
        l.addPoint(4, 4, 4);
        l.addPoint(0, 5, 3.3);
    }
}
