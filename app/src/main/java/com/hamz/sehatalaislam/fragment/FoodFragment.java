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
import com.hamz.sehatalaislam.activity.FoodActivity;
import com.hamz.sehatalaislam.adapter.FoodAdapter;
import com.hamz.sehatalaislam.model.Food;

import java.util.ArrayList;


public class FoodFragment extends Fragment {

    ListView listView;
    FoodAdapter foodAdapter;
    ArrayList<Food> foods;

    public FoodFragment() {
        // Required empty public constructor
    }

    public static FoodFragment newInstance(String param1, String param2) {
        FoodFragment fragment = new FoodFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_food, container, false);

        setArray();
        foodAdapter = new FoodAdapter(v.getContext(), foods);
        listView = (ListView) v.findViewById(R.id.list_view);
        listView.setAdapter(foodAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(view.getContext(), FoodActivity.class));
            }
        });

        return v;
    }



    private void setArray() {
        foods = new ArrayList<>();
        foods.add(new Food(R.drawable.ic_restaurant_2, "Kurma"));
        foods.add(new Food(R.drawable.ic_restaurant_2, "Alpukat"));
    }

}
