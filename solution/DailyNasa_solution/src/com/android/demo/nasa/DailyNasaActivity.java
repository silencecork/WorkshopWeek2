package com.android.demo.nasa;

import com.android.demo.nasa.feed.NasaDaily;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DailyNasaActivity extends Activity {
    
	NasaDaily daily;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView title = (TextView) findViewById(R.id.title);
        TextView date = (TextView) findViewById(R.id.date);
        TextView desc = (TextView) findViewById(R.id.description);
        ImageView image = (ImageView) findViewById(R.id.image);
        Button button1 = (Button) findViewById(R.id.set_wallpaper);
        Button button2 = (Button) findViewById(R.id.refresh);
        
        daily = new NasaDaily(DailyNasaActivity.this);
        daily.processDialyImage(title, date, desc, image);
        
        button1.setOnClickListener(setWallpaper);
        button2.setOnClickListener(refresh);
    }
    
    private OnClickListener setWallpaper = new OnClickListener() {
		
		public void onClick(View v) {
			daily.setAsWallpaper();
		}
	};
	
	private OnClickListener refresh = new OnClickListener() {
		
		public void onClick(View v) {
			TextView title = (TextView) findViewById(R.id.title);
	        TextView date = (TextView) findViewById(R.id.date);
	        TextView desc = (TextView) findViewById(R.id.description);
	        ImageView image = (ImageView) findViewById(R.id.image);
	        daily.processDialyImage(title, date, desc, image);
		}
	};
}