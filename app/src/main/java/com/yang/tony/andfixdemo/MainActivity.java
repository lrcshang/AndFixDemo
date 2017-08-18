package com.yang.tony.andfixdemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;


/**
 * main activity
 */
public class MainActivity extends Activity {
    private static final String APATCH_PATH = "/out.apatch";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String patchFileString = Environment.getExternalStorageDirectory()
                .getAbsolutePath() + APATCH_PATH;
        findViewById(R.id.test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             toast();
            }
        });
        findViewById(R.id.fix).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    MainApplication.mPatchManager.addPatch(patchFileString);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.os.Process.killProcess(android.os.Process.myPid());
    }

    //打包1.apk后，修改toast内容，打包2.apk
    int i=10;
    int a=0;
    private void toast() {
        Toast.makeText(this, "shit:"+10, Toast.LENGTH_SHORT).show();
    }
}
