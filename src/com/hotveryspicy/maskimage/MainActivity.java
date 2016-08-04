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
		Toast.makeText(this, "즐겨 찾기 추가", Toast.LENGTH_SHORT).show();
	}

	public void clickBigImage(View v) {
		Toast.makeText(this, "중앙 이미지 클릭", Toast.LENGTH_SHORT).show();
	}

	public void clickSmallImage1(View v) {
		Toast.makeText(this, "작은 이미지 1번 클릭", Toast.LENGTH_SHORT).show();
	}

	public void clickSmallImage2(View v) {
		Toast.makeText(this, "작은 이미지 2번 클릭", Toast.LENGTH_SHORT).show();
	}

	public void clickSmallImage3(View v) {
		Toast.makeText(this, "작은 이미지 3번 클릭", Toast.LENGTH_SHORT).show();
	}
}
