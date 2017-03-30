package com.example.activitysingleinstance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class thirdActivity extends BaseActivity {
    public static final String TAG="thirdActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Log.d(TAG,TAG+" onCreat");
//        Log.d(TAG,"page3's task id is"+getTaskId());
        setContentView(R.layout.activity_third);

        Button button_exit = (Button)findViewById(R.id.button_exit);
        button_exit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();

            }
        });
    }
/*
    protected  void onStart(){
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
