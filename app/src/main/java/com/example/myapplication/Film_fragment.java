package com.example.myapplication;

import android.hardware.lights.LightState;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Film_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        ViewGroup   viewGroup   =   (ViewGroup)inflater.inflate(R.layout.fragment_film_fragment, null);
        ImageSlider imageSlider  =   (ImageSlider) viewGroup.findViewById(R.id.slider);
        ArrayList<SlideModel>  slideModels    =   new ArrayList<>();
       slideModels.add(new SlideModel("https://c.wallhere.com/photos/37/db/tv_series_Stranger_Things_Netflix-1197548.jpg!d", ScaleTypes.FIT));
        slideModels.add(new SlideModel("", ScaleTypes.FIT));
        slideModels.add(new SlideModel("", ScaleTypes.FIT));
        slideModels.add(new SlideModel("", ScaleTypes.FIT));
        imageSlider.setImageList(slideModels);
        return viewGroup;

    }
}