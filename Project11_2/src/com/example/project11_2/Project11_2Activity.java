package com.example.project11_2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class Project11_2Activity extends Activity {

	private int position;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_project11_2);
		setTitle("갤러리 영화 포스터");
		
		Gallery gallery = (Gallery) findViewById(R.id.gallery);
		MyGalleryAdapter galAdapter = new MyGalleryAdapter(this);
		gallery.setAdapter(galAdapter);
	}
	
	public class MyGalleryAdapter extends BaseAdapter {
		Context context;
		Integer[] posterID = {R.drawable.mov11, R.drawable.mov12,
				R.drawable.mov14, R.drawable.mov15,
				R.drawable.mov16, R.drawable.mov17, };
		public MyGalleryAdapter(Context c) {
			context = c;
		}
		public int getCount() {
			return posterID.length;
		}
		public Object getItem(int arg0) {
			return null;
		}
		public long getItemId(int arg0) {
			return 0;
		}
		public View getView1(int arg0, View arg1, ViewGroup arg2) {
			return null;
		}
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageview = new ImageView(getBaseContext());
		imageview.setLayoutParams(new Gallery.LayoutParams(100,150));
		imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
		imageview.setPadding(5, 5, 5, 5);
		int[] posterId = null;
		imageview.setImageResource(posterId[position]);
		return imageview;
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.project11_2, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
