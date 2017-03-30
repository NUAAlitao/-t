package com.example.activitysingleinstance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {
    public static final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Log.d(TAG,TAG+" onCreat");
//        Log.d("MainActivity","page1's Task id is"+getTaskId());
        setContentView(R.layout.activity_main);
        Button button_page2 = (Button)findViewById(R.id.button_page2);
        button_page2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String data1 = "this is data one";
                String data2 = "this is data two";
                secondActivity.actionStart(MainActivity.this,data1,data2);
            }
        });
    }

 /*   protected  void onStart(){
        super.onStart();
        Log.d(TAG,TAG+" onStart");
    }

    protected void onResume(){
        super.onResume();
        Log.d(TAG,TAG+" onResume");
    }



    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,TAG+" onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,TAG+ " onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,TAG+" onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,TAG+" onRestart");
    }*/
}
