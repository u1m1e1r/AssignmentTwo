package com.example.hp.recyclerviewlearning;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {
    private ArrayList<Contacts> list = new ArrayList<Contacts>();
    private RecyclerView recycleriew;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        for (int i = 0; i < 100; i++) {
            list.add(new Contacts("omar","omar@gmail.com","0324",i));
        }
        View v=inflater.inflate(R.layout.recycler_view_fragment,container,false);
        recycleriew = (RecyclerView) v.findViewById(R.id.myRecyclerView);
        return null;
    }
}
