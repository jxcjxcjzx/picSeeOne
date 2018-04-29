package wifiStore;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

	public class MyDB {
		
		private static final String CREATE_TABLE="create table "+
				Constants.TABLE_NAME+" ("+
				Constants.KEY_ID+" integer primary key autoincrement, "+
				Constants.TITLE_NAME+" text not null, "+
				Constants.LOCAL_NAME+" text not null, "+
				Constants.CONTENT_NAME+" text not null, "+
				Constants.DATE_NAME+" long);";
		
		private SQLiteDatabase db;
		private final Context context;
		private final MyDBhelper dbhelper;
		public MyDB(Context c){
		context = c;
		dbhelper = new MyDBhelper(context, Constants.DATABASE_NAME, null,
		Constants.DATABASE_VERSION);
	}
	public void close()
	{
		db.close();
	}
	
	public void drop()
	{
		db.execSQL("drop table if exists "+Constants.TABLE_NAME);
		db.execSQL(CREATE_TABLE);
	}
	
	
	
	public void open() throws SQLiteException
	{
		try {
			db = dbhelper.getWritableDatabase();
		} 
		catch(SQLiteException ex) {
			Log.v("Open database exception caught", ex.getMessage());
			db = dbhelper.getReadableDatabase();
		}
	}
	
	
	public long insertdiary(String title, String local,String content)
	{
		try{
			ContentValues newTaskValue = new ContentValues();
			newTaskValue.put(Constants.TITLE_NAME, title);
			newTaskValue.put(Constants.LOCAL_NAME,local);
			newTaskValue.put(Constants.CONTENT_NAME, content);
			newTaskValue.put(Constants.DATE_NAME,
			java.lang.System.currentTimeMillis());
			return db.insert(Constants.TABLE_NAME, null, newTaskValue);
		} 
		catch(SQLiteException ex) {
				Log.v("Insert into database exception caught",
				ex.getMessage());
				return -1;
		}
	}
			
	public Cursor getdiaries()
	{
			Cursor c = db.query(Constants.TABLE_NAME, null, null,
			null, null, null, null);
			return c;
	}
	
	public Cursor getdiarieswithwhere(String whereclause){
			Cursor c = db.query(Constants.TABLE_NAME, null, whereclause,
			null, null, null, null);
			return c;
	}
	
	
		
}



