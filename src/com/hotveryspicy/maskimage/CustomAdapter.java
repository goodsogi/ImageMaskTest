package com.hotveryspicy.maskimage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends ArrayAdapter<String> {

	private Context context;
	private final int LIST_ITEM_COUNT = 3;
	private List<String> objects;
	private float smallImage1TouchX;
	private float smallImage1TouchY;
	private float smallImage2TouchX;
	private float smallImage2TouchY;

	public CustomAdapter(Context context, int textViewResourceId,
			List<String> objects) {
		super(context, textViewResourceId, objects);
		this.context = context;
		this.objects = objects;
		
		Resources r = context.getResources();
		smallImage1TouchX = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, r.getDisplayMetrics());
		smallImage1TouchY = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 100, r.getDisplayMetrics());
		smallImage2TouchX = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 230, r.getDisplayMetrics());
		smallImage2TouchY = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 170, r.getDisplayMetrics());

	}

	public int getCount() {
		return 3;
	}

	public String getItem(int index) {
		return null;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		if (row == null) {
			LayoutInflater inflater = (LayoutInflater) this.getContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.row, parent, false);

		}
		
MaskImage centerImage = (MaskImage) row.findViewById(R.id.centerImageview);
		
		centerImage.setOnTouchListener(new OnTouchListener() {

			

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				Log.i("ditto",
						"터치 x 좌표: " + event.getX() + " y 좌표: " + event.getY());
				Toast.makeText(context,
						"터치 x 좌표: " + event.getX() + " y 좌표: " + event.getY(),
						Toast.LENGTH_SHORT).show();

				if (event.getX() > smallImage1TouchX && event.getY() < smallImage1TouchY ) {
					Toast.makeText(context, "작은 이미지 1번 클릭",
							Toast.LENGTH_SHORT).show();
					return false;
				} else if (event.getX() > smallImage2TouchX && event.getY() > smallImage2TouchY ) {
					Toast.makeText(context, "작은 이미지 3번 클릭",
							Toast.LENGTH_SHORT).show();
					return false;
				} else {
					Toast.makeText(context, "중앙 이미지 클릭",
							Toast.LENGTH_SHORT).show();
				}
				return false;
			}
		});

		return row;
	}
	
	public void add(ArrayList<String> strings) {
		objects.addAll(strings);
		
	}


}
