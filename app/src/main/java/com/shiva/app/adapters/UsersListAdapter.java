package com.shiva.app.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.shiva.app.R;
import com.shiva.app.module.Gender;
import com.shiva.app.module.Users;

import java.util.List;

/**
 * Created by OM on 06-10-2017.
 */

public class UsersListAdapter extends BaseAdapter {

    private static String TAG = UsersListAdapter.class.getName();
    private Context context;
    private List<Users> usersList ;
    private LayoutInflater layoutInflater;

    public UsersListAdapter(Context context, List<Users> usersList){
        this.context = context;
        this.usersList = usersList;
    }

    @Override
    public int getCount() {
        return usersList.size();
    }

    @Override
    public Object getItem(int position) {
        return usersList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Users users = usersList.get(position);

        layoutInflater = LayoutInflater.from(this.context);

        convertView = layoutInflater.inflate(R.layout.list_adapter, null);

        TextView name = (TextView) convertView.findViewById(R.id.txtName);
        TextView country = (TextView) convertView.findViewById(R.id.txtCountry);
        TextView gender = (TextView) convertView.findViewById(R.id.txtGender);

        name.setText(users.getName());
        country.setText(users.getCountry());
        gender.setText(users.getGender()== Gender.MALE? "MALE":"FEMALE");

        Log.i(TAG, "Position : "+position+" - View : "+convertView);

        return convertView;
    }
}
