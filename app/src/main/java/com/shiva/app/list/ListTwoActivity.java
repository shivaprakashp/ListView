package com.shiva.app.list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.shiva.app.R;
import com.shiva.app.adapters.UsersListAdapter;
import com.shiva.app.utils.ListUtils;

public class ListTwoActivity extends AppCompatActivity {

    private ListView listView;
    private UsersListAdapter adapter;
    private ListUtils utils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_one);

        initView();
    }

    private void initView() {
        listView = (ListView) findViewById(R.id.listView);
        utils = ListUtils.getInstance(ListTwoActivity.this);

        adapter = new UsersListAdapter(ListTwoActivity.this, utils.getUsersList());
        listView.setAdapter(adapter);
    }
}
