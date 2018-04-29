package com.example.wifilocal;

import java.util.ArrayList;
import java.util.List;

import wifiStore.MyDB;

import android.content.ContentProvider;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.Menu;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

	private WifiManager manager;
	private Button refresh;
	
	// for debug
	private static final String TAG = "MyInfo";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LinearLayout mainview = new LinearLayout(this);
		mainview.setOrientation(1);
		// init the wifi 
		manager = (WifiManager) getSystemService(Context.WIFI_SERVICE);
		
		// add one button for clear the database
		Button cleardata = new Button(this);
		cleardata.setText("clear database");
		Button refresh = new Button(this);
		refresh.setText("\n\n\n\n\n\n\n Scan\n\n\n\n\n\n");
		refresh.setOnClickListener(new View.OnClickListener(){
	        	
	    		public void onClick(View v) {
	    			startWifiFScan();
	    		}
	    	
		});

		cleardata.setOnClickListener(new View.OnClickListener(){
        	
    		public void onClick(View v) {
    			clearDatabase();
    		}
    	
		});
		
		mainview.addView(refresh, new LinearLayout.LayoutParams(

                ViewGroup.LayoutParams.FILL_PARENT,

                ViewGroup.LayoutParams.WRAP_CONTENT,

                0));
		
		mainview.addView(cleardata, new LinearLayout.LayoutParams(

                ViewGroup.LayoutParams.FILL_PARENT,

                ViewGroup.LayoutParams.WRAP_CONTENT,

                0));
		
		

		setContentView(mainview);	
		
		if(manager!=null){
			if(!manager.isWifiEnabled()){
				manager.setWifiEnabled(true);
			}
			
			if(manager.isWifiEnabled()){
				startWifiFScan();	
			}
		}
	
	}
	
	
	protected void clearDatabase() {
		// TODO Auto-generated method stub
		MyDB db = new MyDB(this);
		db.open();
		db.drop();
		db.close();
	}


	public void startWifiFScan()
	{
		if(manager!=null){
			manager.startScan();
			List<ScanResult> wifilist = manager.getScanResults();
		    ArrayList<String> wifiname = new ArrayList<String>();
		    for(ScanResult tmp:wifilist){
		    	wifiname.add(tmp.SSID);
		    	wifiname.add(String.valueOf(tmp.level));
		    	//wifiname.add("bssid : "+tmp.BSSID + "\nÆµÂÊ : " + tmp.frequency + "  Ç¿¶È : " + tmp.level);
		    }   
		    
		    if(!wifiname.isEmpty()){
			    Intent intent = new Intent(this,WifiShow.class);
				// pass the parament to the display program
				intent.putExtra("name", wifiname);
				startActivity(intent);
		    }
		}
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
