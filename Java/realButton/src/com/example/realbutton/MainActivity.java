package com.example.realbutton;

import android.media.AudioManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;

public class MainActivity extends Activity {

	private static final String TAG = "ButtonTag";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void buttonHandle()
	{
		
	}
	
	
	 public void onReceive(Context context, Intent intent) {
		 
		 String intentAction = intent.getAction();
	        if (AudioManager.ACTION_AUDIO_BECOMING_NOISY.equals(intentAction))
	        {
	        	Log.d(TAG, "hello");
	        }
	        else if (Intent.ACTION_MEDIA_BUTTON.equals(intentAction))
	        {
	            KeyEvent event = (KeyEvent) intent.getParcelableExtra(Intent.EXTRA_KEY_EVENT);
	            
	            if (event == null)
	            {
	                return;
	            }
	            
	            int keycode = event.getKeyCode();
	            int action = event.getAction();
	            long eventtime = event.getEventTime();
	            
	            // single quick press: pause/resume. 
	            // double press: next track
	            // long press: start auto-shuffle mode.
	            
	            String command = null;
	            switch (keycode)
	            {
	    
	                case KeyEvent.KEYCODE_HEADSETHOOK:
	                	Log.d(TAG, "hello");
	                	break;
	              
	            }
	    }

	 }
}
