package com.shiva.app.utils;

import android.content.Context;

import com.shiva.app.R;

/**
 * Created by OM on 06-10-2017.
 */

public class ListUtils {

    private String[] names;
    private String[] genders;
    private String[] countries;

    private Context context;

    private static ListUtils utils;
    public ListUtils(Context context){
        this.context = context;

        names = context.getResources().getStringArray(R.array.names);
        genders = context.getResources().getStringArray(R.array.gender);
        countries = context.getResources().getStringArray(R.array.country);
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
}
