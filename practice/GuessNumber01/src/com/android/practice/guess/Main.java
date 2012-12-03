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
        
        // find guess button here
        
        
        Button clearBtn = (Button) findViewById(R.id.btn_restart);
        
        clearBtn.setOnClickListener(clearListener);
        
        // register listener of guess button here
    }
    
    
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