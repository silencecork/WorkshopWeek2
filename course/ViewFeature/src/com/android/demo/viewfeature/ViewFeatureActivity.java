package com.android.demo.viewfeature;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ViewFeatureActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btn1 = (Button) findViewById(R.id.button1); 
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        
        btn1.setOnClickListener(visibleListener);
        btn2.setOnClickListener(inVisibleListener);
        btn3.setOnClickListener(goneListener);
    }
    
    private OnClickListener visibleListener = new OnClickListener() {
		public void onClick(View v) {
			TextView text = (TextView) findViewById(R.id.text);
			text.setVisibility(View.VISIBLE);
		}
    };
    
    private OnClickListener inVisibleListener = new OnClickListener() {
		public void onClick(View v) {
			TextView text = (TextView) findViewById(R.id.text);
			text.setVisibility(View.INVISIBLE);
		}
    };
    
    private OnClickListener goneListener = new OnClickListener() {
		public void onClick(View v) {
			TextView text = (TextView) findViewById(R.id.text);
			text.setVisibility(View.GONE);
		}

    };
}