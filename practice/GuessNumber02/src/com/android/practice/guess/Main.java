package com.android.practice.guess;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        PCNumber.getRandomNumber();
        
        Button guessBtn = (Button) findViewById(R.id.btn_guess);
        Button clearBtn = (Button) findViewById(R.id.btn_restart);
        guessBtn.setOnClickListener(guessListener);
        clearBtn.setOnClickListener(clearListener);
    }
    
    private OnClickListener guessListener = new OnClickListener() {

		public void onClick(View v) {
			EditText num1 = (EditText) findViewById(R.id.num1);
			EditText num2 = (EditText) findViewById(R.id.num2);
			EditText num3 = (EditText) findViewById(R.id.num3);
			EditText num4 = (EditText) findViewById(R.id.num4);
			
			String strN1 = num1.getText().toString();
			String strN2 = num2.getText().toString();
			String strN3 = num3.getText().toString();
			String strN4 = num4.getText().toString();
			
			// TODO add your code here
			
			String result = PCNumber.getGuessResult(strN1, strN2, strN3, strN4);
			
			if (result.equals("4A0B")) {
				// TODO add your code here
				result = getString(R.string.win);
			}
			
			TextView textResult = (TextView) findViewById(R.id.result);
			textResult.setText(strN1 + strN2 + strN3 + strN4 + ":" + result);
			
			clearNumInput();
		}
    	
    };
    
    private OnClickListener clearListener = new OnClickListener() {

		public void onClick(View v) {
			clearNumInput();
			TextView textResult = (TextView) findViewById(R.id.result);
			textResult.setText("");
			PCNumber.getRandomNumber();
		}
    	
    };
    
    private void clearNumInput() {
    	EditText num1 = (EditText) findViewById(R.id.num1);
		EditText num2 = (EditText) findViewById(R.id.num2);
		EditText num3 = (EditText) findViewById(R.id.num3);
		EditText num4 = (EditText) findViewById(R.id.num4);
		
		num1.setText("");
		num2.setText("");
		num3.setText("");
		num4.setText("");
		
    }
    
}