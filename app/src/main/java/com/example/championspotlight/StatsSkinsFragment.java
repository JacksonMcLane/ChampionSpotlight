package com.example.championspotlight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class StatsSkinsFragment extends Fragment {

    private TextView textViewStats, textViewStatsHeader;
    private CarouselView carouselView;
    private int[] skinsPhotos = {R.drawable.fizz_skin_default, R.drawable.fizz_skin_atlantean,
            R.drawable.fizz_skin_tundra, R.drawable.fizz_skin_fisherman, R.drawable.fizz_skin_void,
            R.drawable.fizz_skin_cottontail, R.drawable.fizz_skin_super_galaxy,
            R.drawable.fizz_skin_omega_squad, R.drawable.fizz_skin_fuzz, R.drawable.fizz_skin_fuzz_prestige_edition};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_stats_skins_fragment, container, false);
        wireWidgets(rootView);
        textViewStats.setText(
                "Health: 570 – 2236    Attack Damage: 58.04 – 109.04\n" +
                "Health Regen: 8 – 19.9    Attack Speed: 0.658 (+ 0 – 52.7%)\n" +
                "Armor: 22.412 – 80.21    Crit Damage: 200%\n" +
                "Magic Resist: 32.1 – 53.35    Range: 175\n" +
                "Mana: 317.2 – 946.2    Range Type: MELEE\n" +
                "Mana Regen: 6 – 19.6    Move Speed: 335");
        textViewStatsHeader.setText(R.string.fizz_base_stats);
        carouselView.setPageCount(skinsPhotos.length);
        ImageListener imageListener = new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(skinsPhotos[position]);
            }
        };
        carouselView.setImageListener(imageListener);
        return rootView;
    }

    private void wireWidgets(View rootView) {
        textViewStats = rootView.findViewById(R.id.textView_stats_text);
        textViewStatsHeader = rootView.findViewById(R.id.textView_stats_header);
        carouselView = rootView.findViewById(R.id.carousel_view_stats_skins_view);
    }
}
