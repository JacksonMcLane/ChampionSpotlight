package com.example.championspotlight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class StatsSkinsFragment extends Fragment {

    private TextView textViewStats;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_stats_skins_fragment, container, false);
        textViewStats = rootView.findViewById(R.id.textView_stats_text);
        textViewStats.setText(
                "Health: 570 – 2236    Attack Damage: 58.04 – 109.04\n" +
                "Health Regen: 8 – 19.9    Attack Speed: 0.658 (+ 0 – 52.7%)\n" +
                "Armor: 22.412 – 80.21    Crit Damage: 200%\n" +
                "Magic Resist: 32.1 – 53.35    Range: 175\n" +
                "Mana: 317.2 – 946.2    Range Type: MELEE\n" +
                "Mana Regen: 6 – 19.6    Move Speed: 335");
        wireWidgets(rootView);
        return rootView;
    }

    private void wireWidgets(View rootView) {
        textViewStats = rootView.findViewById(R.id.textView_stats_text);
    }
}
