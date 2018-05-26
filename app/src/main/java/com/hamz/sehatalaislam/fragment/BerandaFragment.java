package com.hamz.sehatalaislam.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.hamz.sehatalaislam.R;
import com.hamz.sehatalaislam.adapter.StatusAdapter;
import com.hamz.sehatalaislam.model.Status;

import java.util.ArrayList;


public class BerandaFragment extends Fragment {

    RecyclerView recyclerView;
    StatusAdapter statusAdapter;
    ArrayList<Status> statuses;
    FloatingActionButton fab;
    Context context;




    public BerandaFragment() {
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
        View v = inflater.inflate(R.layout.fragment_beranda, container, false);

        setArray();

        context = v.getContext();

        statusAdapter = new StatusAdapter(v.getContext(), statuses);

        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(v.getContext()));
        recyclerView.setAdapter(statusAdapter);
        recyclerView.setHasFixedSize(true);


        fab = (FloatingActionButton)v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Post");
                LayoutInflater inflater = LayoutInflater.from(context);
                final View dialogView = inflater.inflate(R.layout.custom_add, null);
                builder.setView(dialogView);
                builder.setNegativeButton("Kembali", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.setPositiveButton("Tambah", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "Coming soon", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();

            }
        });

        return v;
    }

    private void setArray() {
        statuses = new ArrayList<>();
        statuses.add(new Status("Rani Anggraini", "Pasien", "01-10-2012", "Pertanyaan", "Saya sedang mengalami sakit perut sudah 1 minggu, bagaimana cara menanganinya?"));
        statuses.add(new Status("Rangga Mahendra Yusuf", "Ustadz", "05-10-2012", "Sharing", "Saya mengusulkan madu adalah obat yang digunakan pada zaman nabi"));
    }




}
