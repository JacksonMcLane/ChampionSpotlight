package com.example.championspotlight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WFragment extends Fragment {

    private TextView textViewName, textViewCost, textViewRange, textViewCostNum, textViewRangeNum;
    private TextView textViewDescription;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_wfragment, container, false);
        wireWidgets(rootView);
        setValues();
        return rootView;
    }

    private void setValues() {
        textViewName.setText(R.string.menu_w);
        textViewCost.setText(R.string.cost);
        textViewRange.setText(R.string.range);
        textViewCostNum.setText("30 / 40 / 50 / 60 / 70");
        textViewRangeNum.setText(R.string.n_a);
        textViewDescription.setText("PASSIVE: Fizz rends enemies on-hit, and those affected by\nChum " +
                "the Water's lure or shark, dealing them magic damage\nover 3 seconds, " +
                "and marking them for 6 seconds.\n" +
                "\nACTIVE: Fizz's next basic attack is empowered, granting it 50 bonus range and " +
                "resetting his auto attack timer.\nThe empowered strike deals bonus magic damage. If " +
                "the\ntarget has been marked for at least 2 seconds, the damage\ndealt is tripled.\n" +
                "\nIf Seastone Trident kills its target, its cooldown is reduced to 1 second and refunds mana.");

    }

    private void wireWidgets(View rootView) {
        textViewName = rootView.findViewById(R.id.textView_wFragment_name);
        textViewCost = rootView.findViewById(R.id.textView_wFragment_cost);
        textViewRange = rootView.findViewById(R.id.textView_wFragment_range);
        textViewCostNum = rootView.findViewById(R.id.textView_wFragment_cost_num);
        textViewRangeNum = rootView.findViewById(R.id.textView_wFragment_range_num);
        textViewDescription = rootView.findViewById(R.id.textView_wFragment_desc);
    }
}
