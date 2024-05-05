package com.example.fantasyzoo.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.fantasyzoo.Models.FantasyAnimal;
import com.example.fantasyzoo.R;

import java.util.ArrayList;

public class AnimalAdapter extends ArrayAdapter<FantasyAnimal> {
    private Context mContext;
    private ArrayList<FantasyAnimal> mResults;

    public  AnimalAdapter( Context context, ArrayList<FantasyAnimal> results){
        super(context,0, results);
        mContext = context;
        mResults = results;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        ViewHolder viewHolder;

        if (listItemView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            viewHolder = new ViewHolder();

            listItemView = inflater.inflate(R.layout.fantasy_animal_list, parent, false);

            viewHolder.textView = listItemView.findViewById(R.id.animalname);
            viewHolder.imageView = listItemView.findViewById(R.id.img_card);

            listItemView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) listItemView.getTag();
        }

        // Bind data to your grid item layout here
        FantasyAnimal animal = mResults.get(position);

        if (animal.getName() != null) {
            viewHolder.textView.setText(animal.getName());
        }

        return listItemView;
    }


    static class ViewHolder {
        TextView textView;
        ImageView imageView;
    }
}
