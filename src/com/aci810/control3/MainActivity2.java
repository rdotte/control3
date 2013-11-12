package com.aci810.control3;


import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity2 extends Activity {
	

		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main_activity2);
			
			SharedPreferences sharedPref = getSharedPreferences("app-data", Context.MODE_PRIVATE);	
			
			String name = sharedPref.getString(MainActivity.NAME_VALUE, "not set");	
			Boolean switchEdit = (Boolean) sharedPref.getBoolean(MainActivity.SWITCH_VALUE, true);
			Boolean rbEdit01 = (Boolean) sharedPref.getBoolean(MainActivity.RADIOBUTTON01_VALUE, true);
			Boolean rbEdit02 = (Boolean) sharedPref.getBoolean(MainActivity.RADIOBUTTON02_VALUE, true);
			Boolean rbEdit03 = (Boolean) sharedPref.getBoolean(MainActivity.RADIOBUTTON03_VALUE, true);
			int sbEdit = sharedPref.getInt(MainActivity.SEEKBAR_VALUE, 0);
			
	        
			
			
			TextView nameTextView = (TextView) findViewById(R.id.textView1);
	        nameTextView.setText(name);
	
			
	        Switch sw01  = (Switch) findViewById(R.id.sw1);
	        sw01.setChecked(switchEdit);
	        
	        RadioButton rd01  = (RadioButton) findViewById(R.id.radio0);
	        rd01.setChecked(rbEdit01);
	        
	   
			RadioButton rd02  = (RadioButton) findViewById(R.id.radio1);
	        rd02.setChecked(rbEdit02);
	        
	
			RadioButton rd03  = (RadioButton) findViewById(R.id.radio2);
	        rd03.setChecked(rbEdit03);
	        
	        SeekBar sb01 = (SeekBar) findViewById(R.id.seekBar2);
	        sb01.setProgress(sbEdit);
	        sb01.setEnabled(false);
	        
	        
	    	
		}

	
	
		

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			getMenuInflater().inflate(R.menu.main_activity2, menu);
			return true;
		}

		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			switch (item.getItemId()) {
			case android.R.id.home:
				
				NavUtils.navigateUpFromSameTask(this);
				return true;
			}
			return super.onOptionsItemSelected(item);
		}

	}

		

