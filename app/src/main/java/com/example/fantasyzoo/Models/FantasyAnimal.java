package com.example.fantasyzoo.Models;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class FantasyAnimal {
    int id;
    String name;
    int age;
    //String img;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getImgsrc() {
//        return img;
//    }
//
//    public void setImgsrc(String imgsrc) {
//        this.img = imgsrc;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
