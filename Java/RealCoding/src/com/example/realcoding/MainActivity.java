package com.example.realcoding;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	private Socket codeSocket = null;
	private PrintWriter output = null;
	private TextView tv = null;
	private String codes="";
	private InputStream input = null;

	private static final String MYTAG = "MYTCP";
	
	// variable to indicate whether the connection is built
	private boolean isConnected = false;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tv = (TextView)this.findViewById(R.id.textView1);

		Button closeLink = (Button)this.findViewById(R.id.button1);
		Button seeResult = (Button)this.findViewById(R.id.button2);
		closeLink.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				//Log.d(MYTAG, "clicked");
				try {
					if(codeSocket!=null){
						codeSocket.close();
						output.close();
					}
				} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}

			}
			
		});
		
		
		seeResult.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				//Log.d(MYTAG, "clicked");
				try {
					getExecInfo();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			}
			
		});
		
		
		Button coding = (Button)this.findViewById(R.id.button3);
		coding.setOnClickListener(new OnClickListener(){
			
			@Override
			public void onClick(View v) {		
				
				SharedPreferences prefs = getSharedPreferences("myDataStorage",
						MODE_PRIVATE);
						codes = prefs.getString("code", "");
				
				Intent intent = new Intent(MainActivity.this,FullscreenActivity.class);		
				intent.putExtra("comeon", codes);
				startActivity(intent);	
			}
			
		});

		
	}
	

	private void connect(){ 
		tv.setText("尝试连接\n"); 
		try { 
			codeSocket=new Socket("192.168.43.238",8000); 
			output=new PrintWriter(codeSocket.getOutputStream(),true); 
			input = codeSocket.getInputStream();
			tv.setText("完成连接\n"); 
			isConnected = true;
		} catch (UnknownHostException e) { 
		// TODO Auto-generated catch block 
			tv.setText(e.getMessage());
			isConnected = false;
		} catch (IOException e) { 
		// TODO Auto-generated catch block 
			tv.setText(e.getMessage());
			isConnected = false;
		} 
		
	}

	
	public void sendCodeOut(String content) throws IOException{
		if(isConnected&&output!=null){
			output.println(content); 
			output.println("/* this is the lastlineofcodearea */");
		}
		else{
			tv.setText("connection is not built");
		}
	}
	
	public void getExecInfo() throws IOException{		
		try {			
			byte buffer[] = new byte[input.available()];			
			input.read(buffer);
			String msg = new String(buffer);
			tv.setText(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	@Override
	protected void onRestart(){
		super.onRestart();

		SharedPreferences prefs = getSharedPreferences("myDataStorage",
				MODE_PRIVATE);
				codes = prefs.getString("code", "");
				
		// send out the information
				try {
					connect();
					sendCodeOut(codes);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block

					e.printStackTrace();
				}

			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
