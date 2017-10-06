package com.shiva.app.utils;

import android.content.Context;

import com.shiva.app.R;
import com.shiva.app.module.Gender;
import com.shiva.app.module.Users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OM on 06-10-2017.
 */

public class ListUtils {

    private String[] names;
    private String[] genders;
    private String[] countries;

    private Context context;
    private List<Users> usersList;

    private static ListUtils utils;
    public ListUtils(Context context){
        this.context = context;

        names = context.getResources().getStringArray(R.array.names);
        genders = context.getResources().getStringArray(R.array.gender);
        countries = context.getResources().getStringArray(R.array.country);

        //modified util class for BaseAdapter
        //Used in ListViewTwo
        usersList = new ArrayList<>();
        for (int i = 0 ; i < names.length; i++ ){
            Users users = new Users(names[i], countries[i],
                    genders[i].equalsIgnoreCase("male")? Gender.MALE : Gender.FEMALE);

            usersList.add(users);
        }
    }


    public static ListUtils getInstance(Context context){
        if (utils==null){
            utils = new ListUtils(context);
        }

        return utils;
    }

    public String[] getNames() {
        return names;
    }

    public String[] getGenders() {
        return genders;
    }

    public String[] getCountries() {
        return countries;
    }

    public List<Users> getUsersList() {
        return usersList;
    }
}
