package com.example.realbrowser;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		
		WebView webview = new WebView(this);
		getWindow().requestFeature(Window.FEATURE_PROGRESS);
		webview.getSettings().setJavaScriptEnabled(true);
		final Activity activity = this;
		webview.setWebChromeClient(new WebChromeClient() {  
			public void onProgressChanged(WebView view, int progress) {   
				// Activities and WebViews measure progress with different scales.   
				// The progress meter will automatically disappear when we reach 100%    
				      activity.setProgress(progress * 1000);  
				}
			});
		

		webview.setWebChromeClient(new WebChromeClient() {  
			public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {    
				Toast.makeText(activity, "Oh no! " + description, Toast.LENGTH_SHORT).show();  
				}
			});
		
		 String summary = "<html><body>You scored <b>192</b> points.</body></html>"; 
		 webview.loadData(summary, "text/html", null);

		 // load a url set bu developer
		webview.loadUrl("file:///mnt/sdcard/external_sd/tmp//export/SunShine_with_socket_for_phone.html");


		
		
		
		setContentView(webview);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
