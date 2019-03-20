package com.sharma.kuhuk.viewpager_tabdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPast extends Fragment {

    // For RecyclerView
    @SuppressLint("StaticFieldLeak")
    private static RecyclerView recyclerView;
    private static ArrayList<String> stringArrayList;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView.Adapter adapter;
    static View.OnClickListener mvOnClickListener;

    // Default built constructor
    public FragmentPast() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment_past, container, false);

        //RecyclerView code starts here
        // Initialize ArrayList and add elements to it
        stringArrayList = new ArrayList<>();
        for (int i = 0; i <= 14; i++)
            stringArrayList.add("Element " + i);

        recyclerView = rootView.findViewById(R.id.rvPast);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter = new AdapterPast(stringArrayList);
        recyclerView.setAdapter(adapter);

        mvOnClickListener = new FragmentPast.MVPOnClickListener(getActivity());
        //RecyclerView code ends here

        return rootView;
    }

    //onClick events (RecyclerView code)
    private static class MVPOnClickListener implements View.OnClickListener {
        private final Context context;

        private MVPOnClickListener(Context context) {
            this.context = context;
        }

        @Override
        public void onClick(View v) {
            int position = recyclerView.getChildPosition(v);
            Toast.makeText(context, "Element "+position, Toast.LENGTH_LONG).show();
        }
    }
}
