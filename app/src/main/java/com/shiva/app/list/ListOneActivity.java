package com.shiva.app.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.shiva.app.R;
import com.shiva.app.utils.ListUtils;

public class ListOneActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    private ListUtils utils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_one);

        initView();
    }

    private void initView(){
        listView = (ListView) findViewById(R.id.listView);
        utils = ListUtils.getInstance(ListOneActivity.this);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, utils.getNames());
        listView.setAdapter(adapter);
    }
}
