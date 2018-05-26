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
import com.hamz.sehatalaislam.model.Disease;

import java.util.ArrayList;

/**
 * Created by Hamz on 29/04/2018.
 */

public class DiseaseAdapter extends ArrayAdapter<Disease> {

    private ArrayList<Disease> diseases;


    public DiseaseAdapter(Context context, ArrayList<Disease> diseases) {
        super(context, 0, diseases);
        this.diseases = diseases;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Disease disease = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.single_disease, parent, false);
        }

        ImageView thumbnail = (ImageView) convertView.findViewById(R.id.thumbnail);
        TextView textDisease = (TextView) convertView.findViewById(R.id.text_disease);

//        thumbnail.setImageResource(disease.getImage());
        textDisease.setText(disease.getDisease());

        return convertView;




    }
}
