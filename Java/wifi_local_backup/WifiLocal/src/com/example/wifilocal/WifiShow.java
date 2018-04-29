package com.example.wifilocal;

import java.util.ArrayList;
import wifiStore.MyDB;
import wifiStore.Constants;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class WifiShow extends Activity {
	
	private static final String TAG = "wifi";
	ListView wifiview;
	// buttons
	Button loc_control;
	Button time_control;
	private static int loc_num = 0;
	private static int time_num = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		wifiview = new ListView(this);
		wifiview.setDividerHeight(10);
		
		Intent intent = getIntent();
		fillview(intent.getExtras().getStringArrayList("name"),wifiview);
	
		loc_control = new Button(this);		
		time_control = new Button(this);		

		
		buttonRefresh();
		
		Button save_data = new Button(this);
		save_data.setText("save it all");
		
		Button see_data = new Button(this);
		see_data.setText("see it");
		
		LinearLayout lc = new LinearLayout(this);
		LinearLayout ll = new LinearLayout(this);
		
		
		lc.setOrientation(0);
		lc.addView(loc_control,
				new RelativeLayout.LayoutParams(

				ViewGroup.LayoutParams.WRAP_CONTENT,

				ViewGroup.LayoutParams.WRAP_CONTENT));
		lc.addView(save_data,
				new RelativeLayout.LayoutParams(

				ViewGroup.LayoutParams.WRAP_CONTENT,

				ViewGroup.LayoutParams.WRAP_CONTENT));
		lc.addView(time_control,
				new RelativeLayout.LayoutParams(

				ViewGroup.LayoutParams.WRAP_CONTENT,

				ViewGroup.LayoutParams.WRAP_CONTENT));
		lc.addView(see_data,
				new RelativeLayout.LayoutParams(

				ViewGroup.LayoutParams.WRAP_CONTENT,

				ViewGroup.LayoutParams.WRAP_CONTENT));
                
		ll.setOrientation(1);
		ll.addView(lc);
		ll.addView(wifiview,

	            new LinearLayout.LayoutParams(

	                ViewGroup.LayoutParams.MATCH_PARENT,

	                ViewGroup.LayoutParams.MATCH_PARENT,

	                0));
		
		save_data.setOnClickListener(new View.OnClickListener(){
        	
    		public void onClick(View v) {
    			storeThemAll();
    		}
    	
		});
		
		see_data.setOnClickListener(new View.OnClickListener(){
        	
    		public void onClick(View v) {
    			seeThemAll();
    		}
    	
		});
		
		
		loc_control.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				loc_num += 1;
				buttonRefresh();
			}
		});
		
		loc_control.setOnLongClickListener(new View.OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				// TODO Auto-generated method stub
				loc_num-=1;
				buttonRefresh();
				return true;
			}
		});
		
		
		time_control.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				time_num += 1;
				buttonRefresh();
			}
		});
		
		time_control.setOnLongClickListener(new View.OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				// TODO Auto-generated method stub
				time_num-=1;
				buttonRefresh();
				return true;
			}
		});
		
		setContentView(ll);
	}
	
	
	@Override
	protected void onRestart(){
		super.onRestart();
		// you can do something here, if you need
	}
	
	
	
	@Override
	protected void onStop(){
		super.onStop();	
		// you can do something here, if you need
	}
	

	protected void seeThemAll() {
		// TODO Auto-generated method stub
		MyDB db = new MyDB(this);
		
		db.open();
		if(db==null){
			
		}
		else{
			String whereclause = Constants.LOCAL_NAME+" = "+
								  "'"+loc_control.getText().toString().substring(10)+"-"+
								  time_control.getText().toString().substring(11)+"'";
			Cursor c = db.getdiarieswithwhere(whereclause);
			if(c==null){
				db.close();
			}
			else{
				readSqlDataOutandShow(c);
				db.close();
			}
		}
	}

	
	private void readSqlDataOutandShow(Cursor c) {
		// TODO Auto-generated method stub
		
		if(c!=null){
			this.startManagingCursor(c);
			ArrayList<String> lv = new ArrayList<String>(0);
			
			if(c.moveToFirst()){
				do{
					String title = c.getString(c.getColumnIndex(Constants.TITLE_NAME));
					String content = c.getString(c.getColumnIndex(Constants.CONTENT_NAME));
				    lv.add(title);
				    lv.add(content);
				}while(c.moveToNext());
			}
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1);
			for(String stringtmp:lv){
				adapter.add(stringtmp);		
			}
			if(lv.isEmpty()||lv==null){
				Log.d(TAG, "lv is null, or empty");
			}
			else{
				wifiview.setAdapter(adapter);
			}
		}
		else{
			Log.d(TAG, "c is null");
		}
	}
	
	
	


	protected void storeThemAll() {
		// TODO Auto-generated method stub
		MyDB db = new MyDB(this);
		if(db==null){
			Log.d(TAG, "db is null");
		}
		else{
			db.open();
			ArrayAdapter<String> adapter = (ArrayAdapter<String>) wifiview.getAdapter();
			if(adapter==null||adapter.isEmpty()){
				
			}
			else{
				for(int i=0;i<adapter.getCount();i+=2){
					// insert into db the data
					db.insertdiary(adapter.getItem(i), loc_control.getText().toString().substring(10)  
					+"-"+time_control.getText().toString().substring(11), adapter.getItem(i+1));
					
				}
			}
		}
		db.close();
	}

	private void fillview(ArrayList<String> view,ListView list) {
		// TODO Auto-generated method stub
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1);
		for(String stringtmp:view){
			adapter.add(stringtmp);		
		}
		wifiview.setAdapter(adapter);
		
	}

	public void buttonRefresh(){
		loc_control.setText("loc pin : "+String.valueOf(loc_num));
		time_control.setText("time pin : "+String.valueOf(time_num));
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wifi_show, menu);
		return true;
	}

}
