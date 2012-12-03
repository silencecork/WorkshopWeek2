package com.android.demo.bmi;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button button = (Button) findViewById(R.id.btn_ok);
        button.setOnClickListener(calcBMI);
    }
    
    private OnClickListener calcBMI = new OnClickListener() {

		public void onClick(View v) {
			
		}
		
	};
}