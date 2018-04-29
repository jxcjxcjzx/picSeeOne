package com.example.wifilocal;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import wifiStore.Constants;
import wifiStore.MyDB;

import android.content.ContentProvider;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
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
import android.widget.Toast;


public class MainActivity extends Activity {

	private WifiManager manager;
	private Button refresh;
	
	
	private static final String filePath = String.valueOf(Environment.getExternalStorageDirectory())+"//"+"data"+"//"+"wifi"+"//"+"wifi_data_export.txt";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LinearLayout mainview = new LinearLayout(this);
		mainview.setOrientation(1);
		manager = (WifiManager) getSystemService(Context.WIFI_SERVICE);

		Button cleardata = new Button(this);
		cleardata.setText("clear database");
				
		Button refresh = new Button(this);
		refresh.setText("\n\n\n\n\n\n\n Scan\n\n\n\n\n\n");

		Button exportdata = new Button(this);
		exportdata.setText("\n\n\nexport database\n\n\n");
				
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
		
		exportdata.setOnClickListener(new View.OnClickListener(){
        	
    		public void onClick(View v) {
    			exportDatabase();
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
		
		mainview.addView(exportdata, new LinearLayout.LayoutParams(

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
	
	
	public void writeFile(ArrayList<String> arr)
	{
		
		File newtxtfile = new File(Environment.getExternalStorageDirectory()+"//"+"data"+"//"+"wifi","text.txt");
		try{
			if(!newtxtfile.exists())
				newtxtfile.createNewFile();

			FileOutputStream fileos = null;
			try{
				fileos = new FileOutputStream(newtxtfile);
				for(String tmp:arr){
					fileos.write(tmp.getBytes());
					fileos.write(new String("\n").getBytes());
				}
				fileos.close();
			}
			catch (FileNotFoundException e){
				return;
			}
		}
		catch (IOException e){
			return;
		}
	}
	
	protected void exportDatabase() {
		// TODO Auto-generated method stub
	
		MyDB db = new MyDB(this);
		ArrayList<String> store = new ArrayList<String>();
		
		db.open();
		if(db==null){
			
		}
		else{
			Cursor c = db.getdiaries();
			if(c==null){
				db.close();
			}
			else{

				if(c.moveToFirst()){
					do{
						String local_name = c.getString(c.getColumnIndex(Constants.LOCAL_NAME));
						String title = c.getString(c.getColumnIndex(Constants.TITLE_NAME));
						String content = c.getString(c.getColumnIndex(Constants.CONTENT_NAME));

						store.add(local_name);
						store.add(title);
						store.add(content);
					}while(c.moveToNext());
				}

			
				db.close();
				writeFile(store);
				Toast.makeText(this, "finished exporting", Toast.LENGTH_LONG).show();
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
		    	wifiname.add(tmp.BSSID);
		    	wifiname.add(String.valueOf(tmp.level));
		    }   
		    
		    if(!wifiname.isEmpty()){
			    Intent intent = new Intent(this,WifiShow.class);
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
