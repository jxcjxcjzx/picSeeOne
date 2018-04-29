package com.example.picseeonesend;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	 	EditText msg_et ;
	    Button send_bt ;
	    TextView info_tv ;
	    
	    Button enter_bt ;
	    Button left_bt ;
	    Button right_bt ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        msg_et = (EditText) this.findViewById(R.id.editText1);
        send_bt = (Button) this.findViewById(R.id.button1);
        info_tv = (TextView) this.findViewById(R.id.textView1);
        
        enter_bt = (Button) this.findViewById(R.id.button4);
        right_bt = (Button) this.findViewById(R.id.button3);
        left_bt = (Button) this.findViewById(R.id.button2);
 
        // 开启服务器
        // 发送消息
       // change.setOnClickListener(new OnClickListener() {
        send_bt.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
                UDPClient client = new UDPClient(msg_et.getText().toString());
                info_tv.setText(client.send());
            }
        	
        });
        
        right_bt.setOnClickListener(new OnClickListener(){
        	
        		public void onClick(View v) {
        			UDPClient client = new UDPClient("right");
        			info_tv.setText(client.send());
            }
        	
        });

        left_bt.setOnClickListener(new OnClickListener(){
	
        	public void onClick(View v) {
        		UDPClient client = new UDPClient("left");
        		info_tv.setText(client.send());
        	}
	
        });
        
        enter_bt.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		UDPClient client = new UDPClient("enter");
        		info_tv.setText(client.send());
        	}
	
        });
        
   
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
