package com.hamz.sehatalaislam.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hamz.sehatalaislam.R;
import com.hamz.sehatalaislam.activity.PostActivity;
import com.hamz.sehatalaislam.model.Status;

import java.util.ArrayList;

/**
 * Created by Hamz on 29/04/2018.
 */

public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Status> statuses;


    public StatusAdapter(Context c, ArrayList<Status> statuses){
        this.context = c;
        this.statuses = statuses;
    }

    @Override
    public StatusAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_post2, parent, false);
        return new ViewHolder(v);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textNama, textLevel, textDate, textType, textTopic;
        CardView cardView;
        Typeface fontName, fontLevel;
        public ViewHolder(View v){
            super(v);
            textNama = (TextView)v.findViewById(R.id.text_name);
            textLevel = (TextView)v.findViewById(R.id.text_level);
            textDate = (TextView)v.findViewById(R.id.text_date);
            textType = (TextView)v.findViewById(R.id.text_type);
            textTopic = (TextView)v.findViewById(R.id.text_topic);
            cardView = (CardView)v.findViewById(R.id.card_view);
            fontName = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/roboto_medium.otf");
            fontLevel = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/Source_Sans_Pro_Regular.otf");
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {


        holder.textNama.setText(statuses.get(position).getName());
        holder.textNama.setTypeface(holder.fontName);

        holder.textLevel.setText(statuses.get(position).getLevel());
        holder.textDate.setText(statuses.get(position).getDate());
        holder.textTopic.setText(statuses.get(position).getTopic());

        holder.textLevel.setTypeface(holder.fontLevel);
        holder.textTopic.setTypeface(holder.fontLevel);
        holder.textDate.setTypeface(holder.fontName);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context.getApplicationContext(), PostActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return statuses.size();
    }

}
