package com.example.funnyapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* Añado este import */
import com.google.android.gms.maps.SupportMapFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstMapFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstMapFragment extends SupportMapFragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public FirstMapFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static FirstMapFragment newInstance(String param1, String param2) {
        return new FirstMapFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = super.onCreateView(inflater, container, savedInstanceState);

        return root;
    }

}
