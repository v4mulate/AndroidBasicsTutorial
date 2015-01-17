package com.android.basicstutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Chapter2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter2);
        
        Button button1=(Button)findViewById(R.id.button1);
        
        button1.setOnClickListener(new OnClickListener(){
    		public void onClick(View v){
    			Intent intent=new Intent(Chapter2.this,Chapter1.class ); 
    			startActivity(intent);
    		}});
        
    }  
}