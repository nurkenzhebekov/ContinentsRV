package com.example.continentsrv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.continentsrv.databinding.FragmentContinentsListMainBinding;

import java.util.ArrayList;

public class ContinentsListMainFragment extends Fragment implements OnItemClick {

    private FragmentContinentsListMainBinding binding;
    private ArrayList<ContinentsModel> continentsList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentContinentsListMainBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        ContinentsAdapter adapter = new ContinentsAdapter(continentsList, this);
        binding.rvContinentsList.setAdapter(adapter);
    }

    private void loadData() {
        continentsList.add(new ContinentsModel("https://www.thoughtco.com/thmb/" +
                "QtdcqQAt2eopEDYmHaL0Ikbf-Is=/1500x0/filters:no_upscale():max_bytes(150000):" +
                "strip_icc()/euroasia---map-and-navigation-icons-165793623-" +
                "5c4d298346e0fb00014a2bb7.jpg", "Eurasia"));
        continentsList.add(new ContinentsModel("https://cdn.britannica.com/50/3050-050" +
                "-9996F255/North-America-politcal-map-continent.jpg", "North America"));
        continentsList.add(new ContinentsModel("https://cdn.britannica.com/86/3886-050" +
                "-2785B482/South-America-political-continent.jpg", "South America"));
        continentsList.add(new ContinentsModel("https://cdn.britannica.com/63/5363-050" +
                "-E6888A6F/Africa-political-boundaries-continent.jpg", "Africa"));
        continentsList.add(new ContinentsModel("https://cdn.britannica.com/79/6079-" +
                "050-977F6960/Australia.jpg", "Australia"));
    }

    @Override
    public void onItemClick(int position) {
        ContinentsModel continentsModel = continentsList.get(position);
        Bundle bundle = new Bundle();
        bundle.putSerializable("continent", continentsModel);

        ContinetnsInfoFragment continetnsInfoFragment = new ContinetnsInfoFragment();
        continetnsInfoFragment.setArguments(bundle);

        requireActivity().getSupportFragmentManager().beginTransaction().replace
                (R.id.fragment_conrainer, continetnsInfoFragment).addToBackStack(null).commit();

    }
}