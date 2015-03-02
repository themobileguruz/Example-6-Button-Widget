package com.themobileguru.mg_6_buttonaction;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnLongClickListener 
{

	Button btnClick;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnClick = (Button) findViewById(R.id.buttonClick);
		
		btnClick.setOnLongClickListener(this);
		
	}

	@Override
	public boolean onLongClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId())
		{
		case R.id.buttonClick:
			
			Toast.makeText(getApplicationContext(), "Button is Long Pressed", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
		
		return false;
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
}
