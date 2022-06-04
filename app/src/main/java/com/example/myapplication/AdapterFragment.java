package com.example.myapplication;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

 public class AdapterFragment  extends RecyclerView.Adapter<AdapterFragment.ViewHolder> {

    public ArrayList<Model> itemList1;

    public AdapterFragment(ArrayList<Model> itemList1) {
        this.itemList1 = itemList1;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
      //  Log.d("","Show tis viewHold");
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_static_tv, parent, false);
        ViewHolder vh = new ViewHolder(v);
       return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.textView.setText(itemList1.get(position).getType());

    }

    @Override
    public int getItemCount()
    {
        return  5;
    }

     class ViewHolder extends RecyclerView.ViewHolder{
        public TextView    textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView    =   itemView.findViewById(R.id.movie_type);
        }
    }

}
