package com.example.activitysingleinstance;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class secondActivity extends BaseActivity {
    public static final String TAG="secondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//        Log.d(TAG,TAG+" onCreat");
//        Log.d("MainActivity","page2's Task id is"+getTaskId());
        Intent intent = getIntent();
        String data1 = intent.getStringExtra("param1");
        String data2 = intent.getStringExtra("param2");
        Log.d(TAG,data1);
        Log.d(TAG,data2);
        Toast.makeText(this,data1, Toast.LENGTH_SHORT).show();
        Toast.makeText(this,data2, Toast.LENGTH_SHORT).show();
        Button button_page3 = (Button)findViewById(R.id.button_page3);
        button_page3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secondActivity.this,thirdActivity.class);
                startActivity(intent);
            }
        });
    }

    public static void actionStart(Context context, String data1, String data2){
        Intent intent = new Intent(context,secondActivity.class);
        intent.putExtra("param1",data1);
        intent.putExtra("param2",data2);
        context.startActivity(intent);
    }
   /* protected  void onStart(){
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
