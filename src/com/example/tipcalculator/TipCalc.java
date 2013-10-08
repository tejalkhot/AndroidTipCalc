package com.example.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalc extends Activity {

	EditText etAmount;
	
	TextView tipView;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calc);
		 etAmount = (EditText) findViewById(R.id.etAmount);
		 tipView = (TextView) findViewById(R.id.tvTip);
		 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tip_calc, menu);
		return true;
	}

	public void onCalcTip10(View v) {
		calculateTip(10);
	}
	

	public void onCalcTip20(View v) {
		calculateTip(20);
	}
	

	public void onCalcTip15(View v) {
		calculateTip(15);
	}
	
	private void calculateTip(int tipPercent) {
		String str = etAmount.getText().toString();
		int amount = Integer.parseInt(str);
		Integer tip = (tipPercent * 100) / amount;
		tipView.setText(tip.toString());
	}
}
