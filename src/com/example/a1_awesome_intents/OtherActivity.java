package com.example.a1_awesome_intents;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class OtherActivity extends Activity {

	

	TimePicker puzzle; //place this here for larger scope

	Button tryButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other_activity);
	    puzzle = (TimePicker) findViewById(R.id.timePicker1);
	    puzzle.setIs24HourView(true); //so we can pick 13:37


	    tryButton = (Button) findViewById(R.id.try_button);
	    tryButton.setOnClickListener(new View.OnClickListener() {

	      @Override
	      public void onClick(View view) {
	    	  if  ( puzzle.getCurrentHour() == 13 && puzzle.getCurrentMinute() == 37 ) {
                  finish();
	    	  }
	      }

	    });

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
}