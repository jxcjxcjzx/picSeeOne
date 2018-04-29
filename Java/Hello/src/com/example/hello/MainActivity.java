package com.example.hello;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import android.R.color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView text;
	private ImageView picture;
	private Button change;
	private String defaultpath="/mnt/sdcard/data/com.example.hello.MainActivity/PicSeeOne_dic/";
	private String FilterPath;
	private ArrayList<String> dic;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		// set the default things for layouts
		
		
		// add files
		try{
			dic = new ArrayList<String>();
			FilterPath="zoo";
			dic.add("zoo.jpg");
			dic.add("adult.jpg");
			File tmpfile = new File(defaultpath);
			String tmplist[] = tmpfile.list();
			
			for(int i=0;i<tmplist.length;i++)
			{
				dic.add(tmplist[i]);
			}
				
		}
		catch (Exception e){
			
		}
	
		text = (TextView)this.findViewById(R.id.editText1);
		text.setText("");
		picture = (ImageView)this.findViewById(R.id.imageView1);
		picture.setImageDrawable(getResources().getDrawable(R.drawable.actress));
		change = (Button)this.findViewById(R.id.button1);
		
		change.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {		
				
				String LookUp = text.getText().toString();
				if(dic!=null&&LookUp!=null){
					for(int i=0;i<dic.size();i++)
					{
						if(dic.get(i).toString().contains(LookUp))
						{
						    FilterPath = dic.get(i);			
							break;
							
						}
					}
				}
				if(FilterPath!=null)
				{
			     File file=new File(defaultpath+FilterPath);//創建圖片文件為了下面的判斷，你也可以不創建
				
		
			     if(file.exists()){
			         //decodeFile將文件轉化為Bitmap物件 
			         Bitmap bitmap=BitmapFactory.decodeFile(defaultpath+FilterPath);		         
			         picture.setScaleType(ImageView.ScaleType.CENTER);
			         //加載圖檔
			         picture.setImageBitmap(bitmap);
			     }else {
			         
			     }     
				}
				 
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


