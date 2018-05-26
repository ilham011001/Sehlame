package com.hamz.sehatalaislam.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hamz.sehatalaislam.R;
import com.hamz.sehatalaislam.model.Food;

import java.util.ArrayList;

/**
 * Created by Hamz on 29/04/2018.
 */

public class FoodAdapter extends ArrayAdapter<Food> {

    ArrayList<Food> foods;

    public FoodAdapter(@NonNull Context context, ArrayList<Food> foods) {
        super(context, 0, foods);
        this.foods = foods;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Food food = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.single_food, parent, false);
        }

        ImageView thumbnail = (ImageView) convertView.findViewById(R.id.thumbnail);
        TextView textFood = (TextView) convertView.findViewById(R.id.text_food);

//        thumbnail.setImageResource(food.getThumbnail());
        textFood.setText(food.getFood());

        return convertView;

    }

}
