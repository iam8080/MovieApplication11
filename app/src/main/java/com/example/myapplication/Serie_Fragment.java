package com.example.myapplication;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class Serie_Fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ArrayList<Model>    holder  =   new ArrayList<>();
        View v;
        v = inflater.inflate(R.layout.fragment_serie_, container, false);
      RecyclerView recyclerView = v.findViewById(R.id.rv11);
        LinearLayoutManager linearLayoutManager =   new LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        Model   ob1 =   new Model();
        ob1.setType("action");
        holder.add(ob1);
        Model   ob2=   new Model();
        ob2.setType("action");
        holder.add(ob2);
        Model   ob3 =   new Model();
        ob3.setType("sdds");
        holder.add(ob3);
        Model   ob4 =   new Model();
        ob4.setType("sddsaxtq");
        holder.add(ob4);
        Model   ob5 =   new Model();
        ob5.setType("rerey");
        holder.add(ob5);
        Model   ob6=   new Model();
        ob6.setType("twrrsci");
        holder.add(ob6);
        recyclerView.setAdapter( new AdapterFragment(holder));
        return v   ;
    }
}
