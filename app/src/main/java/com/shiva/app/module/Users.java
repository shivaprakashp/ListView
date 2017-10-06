package com.shiva.app.module;

/**
 * Created by OM on 06-10-2017.
 */

public class Users {

    private String name;
    private String country;
    private Gender gender;

    public Users(){
        super();
    }

    public Users(String name, String country, Gender gender){
        this.name = name;
        this.country = country;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Gender getGender() {
        return gender;
    }
}
