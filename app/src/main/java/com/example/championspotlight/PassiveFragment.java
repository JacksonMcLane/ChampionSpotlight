package com.example.championspotlight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PassiveFragment extends Fragment {

    private TextView textViewName, textViewCost, textViewRange, textViewCostNum, textViewRangeNum;
    private TextView textViewDescription;
    private ImageView imageViewPicture;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_passive_fragment, container, false);
        wireWidgets(rootView);
        setValues();
        return rootView;
    }

    private void setValues() {
        textViewName.setText(R.string.menu_passive);
        textViewCost.setText(R.string.cost);
        textViewRange.setText(R.string.range);
        textViewCostNum.setText(R.string.n_a);
        textViewRangeNum.setText(R.string.n_a);
        textViewDescription.setText("Fizz is perpetually Ghost ghosted and takes 4 / 6 / 8 /" +
                " 10 / 12 / 14 less physical damage from basic attacks, calculated before armor.");
    }

    private void wireWidgets(View rootView) {
        textViewName = rootView.findViewById(R.id.textView_passive_name);
        textViewCost = rootView.findViewById(R.id.textView_passive_cost);
        textViewRange = rootView.findViewById(R.id.textView_passive_range);
        textViewCostNum = rootView.findViewById(R.id.textView_passive_cost_number);
        textViewRangeNum = rootView.findViewById(R.id.textView_range_number);
        textViewDescription = rootView.findViewById(R.id.textView_passive_description);
        imageViewPicture = rootView.findViewById(R.id.imageView_passive_image);
    }
}
