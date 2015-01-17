package com.android.basicstutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
    	Button button1 = (Button)findViewById(R.id.button1);
    	Button button2 = (Button)findViewById(R.id.button2);
    	Button button3 = (Button)findViewById(R.id.button3);
    	
    	button1.setOnClickListener(new OnClickListener(){
		public void onClick(View v) {
		Intent intent = new Intent(MainActivity.this, Chapter1.class);
		startActivity(intent);
		}});
    	
    	button2.setOnClickListener(new OnClickListener(){
		public void onClick(View v) {
		Intent intent = new Intent(MainActivity.this, Chapter2.class);
		startActivity(intent);
		}});
    	
    	button3.setOnClickListener(new OnClickListener(){
		public void onClick(View v) {
		Intent intent = new Intent(Intent.ACTION_MAIN);
		intent.addCategory(Intent.CATEGORY_HOME);
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(intent);
		}}); 
    	
	}
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
