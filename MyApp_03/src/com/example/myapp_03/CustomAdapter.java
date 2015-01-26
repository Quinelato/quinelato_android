package com.example.myapp_03;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;

public class CustomAdapter {

	ArrayList<DataItem> data;
	Context context;
	private static LayoutInflater inflater = null;

	public CustomAdapter(Context context, ArrayList<DataItem> data) {
		this.context = context;
		this.data = data;
		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
}
