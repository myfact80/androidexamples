package com.windrises.app.tracetravel.setup;

import java.util.ArrayList;

import com.windrises.app.tracetravel.R;
import com.windrises.app.tracetravel.dto.Category;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class CategoryMngAct extends Activity {
	
	private ArrayList<Category> list;
	private ListView lv;
	private CategoryMngAdapter adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.category_manager);
		
		list = new ArrayList<Category>();
		list.add(new Category("캠핑",1,1));
		list.add(new Category("가계부",2,2));
		list.add(new Category("여행",3,1));
		
		lv = (ListView)findViewById(R.id.category_manager_listView);
		
		adapter = new CategoryMngAdapter(CategoryMngAct.this,R.layout.category_manager_row,list);
		lv.setAdapter(adapter);
	}
}
