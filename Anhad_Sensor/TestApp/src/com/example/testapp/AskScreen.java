package com.example.testapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class AskScreen extends Activity {

	private boolean calibrateByDefault = false;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_ask_screen, menu);
        return true;
    }
    
    public void userReturn(View view)
    {
    	Intent intent = new Intent (AskScreen.this,DisplayMessageActivity.class);
    	startActivity(intent);
    }
    public void setEverytime(View view2)
    {
    	if(calibrateByDefault==true)
    		calibrateByDefault=false;
    	else
    		calibrateByDefault=true;
    }
}
