package com.sharma.kuhuk.viewpager_tabdemo;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AdapterPast extends RecyclerView.Adapter<AdapterPast.PastViewHolder> {

    private final ArrayList<String> arrayList;
    AdapterPast(ArrayList<String> strings) {
        arrayList = strings;
    }

    @NonNull
    @Override
    public PastViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_adapter_past, viewGroup, false);
        view.setOnClickListener(FragmentPast.mvOnClickListener);
        return new AdapterPast.PastViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PastViewHolder pastViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    //inner class - ViewHolder
    static class PastViewHolder extends RecyclerView.ViewHolder {

        PastViewHolder(View v) {
            super(v);
        }
    }
}
