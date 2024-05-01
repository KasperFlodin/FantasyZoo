package com.example.fantasyzoo.Models;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class ZooKeeper {
    public int id;
    public String name;
    public int age;
    public static List<ZooKeeper> zookeepers;

    public static void createZooKeepers(){
        String json = "[{\"id\":0,\"name\":\"bent,\"age\":\"25,}," +
                "{\"id\":0,\"name\":\"jan,\"age\":\"35,}," +
                "{\"id\":0,\"name\":\"sarah,\"age\":\"23,}," +
                "{\"id\":0,\"name\":\"jasmin,\"age\":\"32,}," +
                "{\"id\":0,\"name\":\"maria,\"age\":\"27,},]";
        zookeepers = new Gson().fromJson(json, new TypeToken<List<ZooKeeper>>(){}.getType() );
    }
}
