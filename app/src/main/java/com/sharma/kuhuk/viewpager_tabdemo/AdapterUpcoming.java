package com.sharma.kuhuk.viewpager_tabdemo;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterUpcoming extends RecyclerView.Adapter<AdapterUpcoming.UpcomingViewHolder> {

    private final ArrayList<String> arrayList;
    AdapterUpcoming(ArrayList<String> strings) {
        arrayList = strings;
    }

    @NonNull
    @Override
    public UpcomingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_adapter_upcoming, viewGroup, false);
        view.setOnClickListener(FragmentUpcoming.mvOnClickListener);
        return new AdapterUpcoming.UpcomingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UpcomingViewHolder upcomingViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    //inner class - ViewHolder
    static class UpcomingViewHolder extends RecyclerView.ViewHolder {

//        ImageView ivCardImage;

        UpcomingViewHolder(View v) {
            super(v);

//            this.tvLocationTag1 = v.findViewById(R.id.tvLocationTag1);
        }
    }

    TextView tvDate, tvTime, tvTimeVal, tvPlace, tvPropertyName, tvAddressLine1, tvAddressLine2;
    Button btnChange, btnCancel;

    private void setupUIViews(View view) {
        tvDate = view.findViewById(R.id.tvDate);
        tvTime = view.findViewById(R.id.tvTime);
        tvTimeVal = view.findViewById(R.id.tvTimeVal);
        tvPlace = view.findViewById(R.id.tvPlace);
        tvPropertyName = view.findViewById(R.id.tvPropertyName);
        tvAddressLine1 = view.findViewById(R.id.tvAddressLine1);
        tvAddressLine2 = view.findViewById(R.id.tvAddressLine2);
        btnChange = view.findViewById(R.id.btnChange);
        btnCancel = view.findViewById(R.id.btnCancel);
    }
}
