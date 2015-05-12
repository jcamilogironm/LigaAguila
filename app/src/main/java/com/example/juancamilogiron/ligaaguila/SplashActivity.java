package com.example.juancamilogiron.ligaaguila;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;



public class SplashActivity extends ActionBarActivity {

    boolean spActive;
    boolean spPaused;
    long spTime=3000;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        spPaused=false;
        spActive=true;

        Thread splashTimer=new Thread(){

            public void run(){
                try{
                    long ms=0;
                    while(spActive&&ms<spTime){
                        sleep(100);

                        if (!spPaused)
                            ms+=100;

                    }

                    startActivity(new Intent("com.example.juancamilogiron.ligaaguila.CLEARSPLASH"));

                    finish();

                }catch(Exception e){

                    System.out.println(e.toString());

                }



            }


        };

        splashTimer.start();
        setContentView(R.layout.activity_splash);
        return;
    }

    protected void onStop(){

        super.onStop();

    }

    protected void onPause(){
        super.onPause();
        spPaused=true;
    }

    protected void onResume(){

        super.onResume();
        spPaused=false;
    }

    protected void onDestroy(){
        super.onDestroy();

    }

    public boolean onKeyDown(int keyCode,KeyEvent event){

        super.onKeyDown(keyCode,event);
        spActive=false;
        return true;
    }


}
