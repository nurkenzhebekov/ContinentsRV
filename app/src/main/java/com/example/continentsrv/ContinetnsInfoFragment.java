package com.example.continentsrv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.continentsrv.databinding.FragmentContinetnsInfoBinding;

import java.util.ArrayList;

public class ContinetnsInfoFragment extends Fragment {

    private FragmentContinetnsInfoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentContinetnsInfoBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            ContinentsModel continentsModel = (ContinentsModel) getArguments()
                    .getSerializable("continent");
            Glide.with(binding.ivContinent).load(continentsModel.getContinentImg()).into(binding.ivContinent);
            binding.tvContinentName.setText(continentsModel.getContinentName());
            switch (continentsModel.getContinentName()) {
                case "Eurasia": {
                    ArrayList<String> eurasiaCities = new ArrayList<>();
                    eurasiaCities.add("Moscow");
                    eurasiaCities.add("London");
                    eurasiaCities.add("Paris");
                    eurasiaCities.add("Beijing");
                    eurasiaCities.add("New Delhi");

                    StringBuilder citiesName = new StringBuilder();
                    for (String city : eurasiaCities) {
                        citiesName.append(city).append("\n");
                    }
                    binding.cityName.setText(citiesName.toString());
                } break;
                case "North America": {
                    ArrayList<String> northAmericaCities = new ArrayList<>();
                    northAmericaCities.add("New York");
                    northAmericaCities.add("Los Angeles");
                    northAmericaCities.add("Chicago");
                    northAmericaCities.add("Toronto");
                    northAmericaCities.add("Mexico");

                    StringBuilder citiesName = new StringBuilder();
                    for (String city : northAmericaCities) {
                        citiesName.append(city).append("\n");
                    }
                    binding.cityName.setText(citiesName.toString());
                } break;
                case "South America": {
                    ArrayList<String> southAmericaCities = new ArrayList<>();
                    southAmericaCities.add("Rio de Janeiro");
                    southAmericaCities.add("Buenos Aires");
                    southAmericaCities.add("Lima");
                    southAmericaCities.add("La Paz");
                    southAmericaCities.add("Cartagena de Indias");

                    StringBuilder citiesName = new StringBuilder();
                    for (String city : southAmericaCities) {
                        citiesName.append(city).append("\n");
                    }
                    binding.cityName.setText(citiesName.toString());
                } break;
                case "Africa": {
                    ArrayList<String> africaCities = new ArrayList<>();
                    africaCities.add("Kinshasa");
                    africaCities.add("Lagos");
                    africaCities.add("Cairo");
                    africaCities.add("Giza");
                    africaCities.add("Luanda");

                    StringBuilder citiesName = new StringBuilder();
                    for (String city : africaCities) {
                        citiesName.append(city).append("\n");
                    }
                    binding.cityName.setText(citiesName.toString());
                } break;
                case "Australia": {
                    ArrayList<String> australiaCities = new ArrayList<>();
                    australiaCities.add("Melbourne");
                    australiaCities.add("Sydney");
                    australiaCities.add("Brisbane");
                    australiaCities.add("Perth");
                    australiaCities.add("Adelaide");

                    StringBuilder citiesName = new StringBuilder();
                    for (String city : australiaCities) {
                        citiesName.append(city).append("\n");
                    }
                    binding.cityName.setText(citiesName.toString());
                } break;
            }
        }
    }
}