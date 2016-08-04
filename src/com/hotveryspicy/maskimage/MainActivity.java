package com.hotveryspicy.maskimage;

import java.util.ArrayList;
import java.util.Arrays;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ImageView.ScaleType;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ListView myListView = (ListView) findViewById(R.id.myListView);
		String[] values = new String[] { "Android", "iPhone", "WindowsMobile" };
		ArrayList<String> lst = new ArrayList<String>();
		lst.addAll(Arrays.asList(values));
		CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, 0,
				lst);
		myListView.setAdapter(customAdapter);

	}

	public void clickStar(View v) {
		Toast.makeText(this, "��� ã�� �߰�", Toast.LENGTH_SHORT).show();
	}

	public void clickBigImage(View v) {
		Toast.makeText(this, "�߾� �̹��� Ŭ��", Toast.LENGTH_SHORT).show();
	}

	public void clickSmallImage1(View v) {
		Toast.makeText(this, "���� �̹��� 1�� Ŭ��", Toast.LENGTH_SHORT).show();
	}

	public void clickSmallImage2(View v) {
		Toast.makeText(this, "���� �̹��� 2�� Ŭ��", Toast.LENGTH_SHORT).show();
	}

	public void clickSmallImage3(View v) {
		Toast.makeText(this, "���� �̹��� 3�� Ŭ��", Toast.LENGTH_SHORT).show();
	}
}
