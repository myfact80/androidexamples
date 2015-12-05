package com.windrises.app.tracetravel.setup;

import java.util.ArrayList;

import com.windrises.app.tracetravel.dto.Category;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CategoryMngAdapter extends BaseAdapter {

	private Context context;
	private int layout;
	private ArrayList<Category> list;
	private LayoutInflater inflater;
	
	public CategoryMngAdapter(Context c, int l, ArrayList<Category> d){
		this.context = c;
		this.layout = l;
		this.list = d;
		inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		if(convertView == null){
			convertView = inflater.inflate(this.layout, parent, false);
		}
		
		if((position%2)==1){
			convertView.setBackgroundColor(0x5000ff00);
		}else{
			convertView.setBackgroundColor(0x2000ff00);
		}
		return convertView;
	}

}
