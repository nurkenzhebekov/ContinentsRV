package com.example.continentsrv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.continentsrv.databinding.ItemContinentsListBinding;

import java.util.ArrayList;

public class ContinentsAdapter extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<ContinentsModel> continentsList;
    private OnItemClick onClick;

    public ContinentsAdapter(ArrayList<ContinentsModel> continentsList, OnItemClick onClick) {
        this.continentsList = continentsList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemContinentsListBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(continentsList.get(position));

        holder.itemView.setOnClickListener(v -> {
            onClick.onItemClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continentsList.size();
    }
}

class ViewHolder extends RecyclerView.ViewHolder {

    private ItemContinentsListBinding binding;

    public ViewHolder(@NonNull ItemContinentsListBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(ContinentsModel continent) {
        binding.tvContinentName.setText(continent.getContinentName());
        Glide.with(binding.ivContinent).load(continent.getContinentImg()).into(binding.ivContinent);
    }
}


