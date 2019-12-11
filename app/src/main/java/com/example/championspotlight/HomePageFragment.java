package com.example.championspotlight;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomePageFragment extends Fragment {
    TextView textViewWelcome, textViewName, textViewTitle;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_homefragment, container, false);
        wireWidgets(rootView);
        setValues();
        return rootView;
    }

    private void setValues() {
    }

    private void wireWidgets(View rootView) {
    }

}
