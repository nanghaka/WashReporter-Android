package com.ilicit.washreporter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by NANGHAKA on 2/6/2016.
 */

public class StartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Thread timer =new Thread(){
            public void run(){
                try {
                    sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent MainPage = new Intent(StartActivity.this,MainActivity.class);
                    startActivity(MainPage);
                    finish();

                }
            }
        };
        timer.start();
    }

}
