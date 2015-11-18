package com.example.ex8_1;

import android.support.v7.app.ActionBarActivity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

@SuppressLint("NewApi")
public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btnRead, btnWrite;
		btnRead = (Button) findViewById(R.id.btnRead);
		btnWrite = (Button) findViewById(R.id.btnWrite);
		
		btnWrite.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				try {
					FileOutputStream outFs = openFileOutput("file.txt", Context.MODE_WORLD_WRITEABLE);
					String str = "ÄîºÏ ¾Èµå·ÎÀÌµå";
					outFs.write(str.getBytes());
					outFs.close();
					Toast.makeText(getApplicationContext(), "file.txt°¡ »ý¼ºµÊ", 0).show();
				} catch (IOException e) { }
			}
		});
		
	btnRead.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			try {
				FileInputStream inFs = openFileInput("file.txt");
				byte[] txt = new byte[30];
				inFs.read(txt);
				String str = new String(txt);
				Toast.makeText(getApplicationContext(), str, 0).show();
				inFs.close();
			} catch (IOException e) {
				Toast.makeText(getApplicationContext(), "ÆÄÀÏ ¾øÀ½", 0).show(); }
		}
	});
	}
}