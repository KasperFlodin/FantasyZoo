package com.example.fantasyzoo.Adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.example.fantasyzoo.Models.FantasyAnimal;

import java.util.ArrayList;

public class AnimalAdapter extends ArrayAdapter<FantasyAnimal> {
    private Context mContext;
    private ArrayList<FantasyAnimal> mResults;

    public  AnimalAdapter( Context context, ArrayList<FantasyAnimal> results){
        super(context,0, results);
        mContext = context;
        mResults = results;
    }
}
