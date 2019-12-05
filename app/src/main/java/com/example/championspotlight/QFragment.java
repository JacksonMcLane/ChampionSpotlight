package com.example.championspotlight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class QFragment extends Fragment {

    private TextView textViewName, textViewCost, textViewRange, textViewCostNum, textViewRangeNum, textViewDescription;
    private ImageView imageViewPicture;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_qfragment, container, false);
        wireWidgets(rootView);
        setValues();
        return rootView;
    }

    private void setValues() {
        textViewName.setText(R.string.menu_q);
        textViewCost.setText(R.string.cost);
        textViewRange.setText(R.string.range);
        textViewRangeNum.setText("550");
        textViewCostNum.setText("50 Mana");
        textViewDescription.setText("Fizz dashes through his target, dealing (+100% total)" +
                " physical damage plus magic damage. This spell applies on-hit effects.");
    }

    private void wireWidgets(View rootView) {
        textViewName = rootView.findViewById(R.id.textView_qFragment_name);
        textViewCost = rootView.findViewById(R.id.textView_qFragment_cost);
        textViewRange = rootView.findViewById(R.id.textView_qFragment_range);
        textViewCostNum = rootView.findViewById(R.id.textView_qFragment_costNumber);
        textViewRangeNum = rootView.findViewById(R.id.textView_qFragment_rangeNumber);
        imageViewPicture = rootView.findViewById(R.id.imageView_qFragment_image);
        textViewDescription = rootView.findViewById(R.id.textView_qFragment_description);
    }
}
