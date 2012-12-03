package com.android.demo.background;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class BackgroundResActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(listener);
    }
    
    private OnClickListener listener = new OnClickListener() {
		public void onClick(View v) {
			LinearLayout layout = (LinearLayout) findViewById(R.id.root);
			layout.setBackgroundResource(R.drawable.bkg02);
		}
    };
}
