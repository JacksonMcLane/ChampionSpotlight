package com.example.championspotlight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class EFragment extends Fragment {
    private TextView textViewName, textViewCost, textViewRange, textViewCostNum, textViewRangeNum, textViewDescription;
    private ImageView imageViewPicture;
    /**INCOMPLETE FRAGMENT*/
    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        
        View rootView = inflater.inflate(R.layout.activity_efragment, container, false);
        wireWidgets(rootView);
        setValues();
        return rootView;
    }

    private void setValues() {


        textViewCostNum.setText("90 / 95 / 100 / 105 / 110 Mana");
        Log.d("EFragment", "setValues: " + textViewCostNum.getText());

        textViewCost.setText(R.string.cost);

        textViewRange.setText(R.string.range);

        textViewRangeNum.setText("400");

        textViewName.setText("Playful / Trickster");
        textViewDescription.setText("\n" +
                "First Cast: Fizz hops on his trident towards the cursor,\nbecoming briefly untargetable." +
                "\nSecond Cast: Fizz cancels the spell early, jumping towards\nthe cursor a second time and dealing" +
                " magic damage to\nnearby enemies.\n" +
                "If Fizz does not reactivate, he deals damage in a larger area\nand slows all enemies hit for 2 seconds.");
    }

    private void wireWidgets(View rootView) {
        textViewName = rootView.findViewById(R.id.textView_eFragment_name);
        textViewCost = rootView.findViewById(R.id.textView_eFragment_cost);
        textViewRange = rootView.findViewById(R.id.textView_eFragment_range);
        textViewCostNum = rootView.findViewById(R.id.textView_eFragment_costNum);
        textViewRangeNum = rootView.findViewById(R.id.textView_eFragment_rangeNum);
        imageViewPicture = rootView.findViewById(R.id.imageView_eFragment_image);
        textViewDescription = rootView.findViewById(R.id.textView_eFragment_description);
    }
}
