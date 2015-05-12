package com.example.juancamilogiron.ligaaguila;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;


public class SplashActivity extends Activity {

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
