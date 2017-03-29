package com.gita.viewpager;

/**
 * Created by adv on 3/14/2017.
 */

public class MyData {
    String name ,location,password,detail;

    public MyData(String name, String location,String pass, String detail) {
        this.name = name;
        this.location = location;
        this.password=pass;
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDetail() {
        return detail;
    }

    public String getPassword() {
        return password;
    }
}
