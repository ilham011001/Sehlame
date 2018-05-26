package com.hamz.sehatalaislam.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.hamz.sehatalaislam.R;
import com.hamz.sehatalaislam.activity.DiseaseActivity;
import com.hamz.sehatalaislam.adapter.DiseaseAdapter;
import com.hamz.sehatalaislam.model.Disease;

import java.util.ArrayList;



public class DiseaseFragment extends Fragment {

    ListView listView;
    DiseaseAdapter diseaseAdapter;
    ArrayList<Disease> diseases;

    public DiseaseFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_disease, container, false);


        listView = (ListView)v.findViewById(R.id.list_view);


        setArray();
        diseaseAdapter = new DiseaseAdapter(v.getContext(), diseases);

        listView.setAdapter(diseaseAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(view.getContext(), DiseaseActivity.class));
            }
        });


        return v;
    }

    private void setArray() {
        diseases = new ArrayList<>();
        diseases.add(new Disease(R.drawable.ic_bacteria, "Sakit Perut"));
        diseases.add(new Disease(R.drawable.ic_bacteria, "Sakit Kepala"));
        diseases.add(new Disease(R.drawable.ic_bacteria, "Batuk"));
    }


}
