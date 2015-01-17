package com.android.basicstutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Chapter1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter1);
        Button chapter1_back=(Button)findViewById(R.id.chapter1_back);
        Button chapter1_next=(Button)findViewById(R.id.chapter1_next);
        
        chapter1_next.setOnClickListener(new OnClickListener(){
        		public void onClick(View v){
        			Intent intent=new Intent(Chapter1.this,Chapter2.class ); 
        			startActivity(intent);
        		}});
        
        chapter1_back.setOnClickListener(new OnClickListener(){
    		public void onClick(View v){
    			Intent intent=new Intent(Chapter1.this,MainActivity.class ); 
    			startActivity(intent);
    		}});
        
        }
    
}
