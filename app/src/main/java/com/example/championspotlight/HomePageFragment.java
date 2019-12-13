package com.example.championspotlight;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomePageFragment extends Fragment {
    TextView textViewWelcome;
    Button buttonGoNext;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_homefragment, container, false);
        wireWidgets(rootView);
        setValues();
        setOnClickListeners();
        return rootView;
    }

    private void setOnClickListeners() {
        buttonGoNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), StatsSkinsFragment.class);
                StatsSkinsFragment nextFrag= new StatsSkinsFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.constraintLayout_statsSkinFragment, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
                startActivity(i);
            }
        });
    }

    private void setValues() {
        buttonGoNext.setText("Go Next.");
        textViewWelcome.setText("Welcome to the League of Legends Champion Spotlight" + "\n" +
            "Featuring Fizz, the Tidal Trickster.");
    }

    private void wireWidgets(View rootView) {
        buttonGoNext = rootView.findViewById(R.id.button_homeFragment_button);
        textViewWelcome = rootView.findViewById(R.id.textView_homeFragment_welcome);

    }

}
