package com.aci810.control3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends Activity {
	
	
	public final static String NAME_VALUE = "com.aci810.control3.NAME_VALUE";	
	public final static String SWITCH_VALUE ="com.aci810.control3.SWITCH_VALUE";
	public final static String RADIOBUTTON01_VALUE ="com.aci810.control3.RADIOBUTTON01_VALUE";
	public final static String RADIOBUTTON02_VALUE ="com.aci810.control3.RADIOBUTTON02_VALUE";
	public final static String RADIOBUTTON03_VALUE ="com.aci810.control3.RADIOBUTTON03_VALUE";
	public final static String SEEKBAR_VALUE ="com.aci810.control3.SEEKBAR_VALUE";


	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	public void onSubmitForm(View view) {		
		
		Intent intent = new Intent(this, MainActivity2.class);				
		
		
        EditText nameEditText = (EditText) findViewById(R.id.editText1);
        String name = nameEditText.getText().toString();
        
        
        Switch switchEditText = (Switch) findViewById(R.id.switchView1);
		Boolean switchEditOn = switchEditText.isChecked();
		
				
		RadioButton rbEditText01 = (RadioButton) findViewById(R.id.op1);
		Boolean rbEdit01 = rbEditText01.isChecked();
		

		RadioButton rbEditText02 = (RadioButton) findViewById(R.id.op2);
		Boolean rbEdit02 = rbEditText02.isChecked();
		

		RadioButton rbEditText03 = (RadioButton) findViewById(R.id.op3);
		Boolean rbEdit03 = rbEditText03.isChecked();
		

        SeekBar sbEditText = (SeekBar) findViewById(R.id.seekBar1);
        
        Integer sbEdit = sbEditText.getProgress();
        
		
		
		
		
		
        
        SharedPreferences sharedPref = getSharedPreferences("app-data", Context.MODE_PRIVATE);		
        SharedPreferences.Editor editor = sharedPref.edit();		
        
        editor.putString(NAME_VALUE, name);	
        editor.putBoolean(SWITCH_VALUE, switchEditOn);
        editor.putBoolean(RADIOBUTTON01_VALUE, rbEdit01);
        editor.putBoolean(RADIOBUTTON02_VALUE, rbEdit02);
        editor.putBoolean(RADIOBUTTON03_VALUE, rbEdit03);
        editor.putInt(SEEKBAR_VALUE, sbEdit);
        
       

        editor.commit();
        
        
        
        

        startActivity(intent);
	}
}

	
	

