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

public class RFragment extends Fragment {
    private TextView textViewName, textViewCost, textViewRange, textViewCostNum, textViewRangeNum, textViewDescription;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        
        View rootView = inflater.inflate(R.layout.activity_rfragment, container, false);
        wireWidgets(rootView);
        setValues();
        return rootView;
    }
    private void setValues() {
        textViewName.setText(R.string.menu_r);
        textViewCost.setText(R.string.cost);
        textViewRange.setText(R.string.range);
        textViewRangeNum.setText("550");
        textViewCostNum.setText("50 Mana");
        textViewDescription.setText("ACTIVE: Fizz throws down a lure in the target direction that " +
                "attracts a shark, causing it to emerge after 2 seconds, dealing magic damage, " +
                "Airborne icon knocking aside surrounding enemies and Slow icon slowing them for 2 " +
                "seconds. The further the lure travels in its initial flight, the larger the shark " +
                "that is attracted, increasing its slow, eruption radius and knockback distance. \n \n" +
                "GUPPY (<455): 40% slow, 200 eruption radius and 150 unit knockback distance.\n" +
                "\n" +
                "GUPPY DAMAGE:\n" +
                "150 / 250 / 350 (+ 80% AP)" +
                "\t\n" +
                "CHOMPER (455-910): 60% slow, 325 eruption radius and 250 unit knockback distance.\n" +
                "\n" +
                "CHOMPER DAMAGE:\n" +
                "225 / 325 / 425 (+ 100% AP)" +
                "GIGALODON (>910): 80% slow, 450 eruption radius and 350 unit knockback distance.\n" +
                "\n" +
                "GIGALODON DAMAGE:\n" +
                "300 / 400 / 500 (+ 120% AP)" +
                "\t\n" +
                "If an enemy champion intercepts the lure as it flies, it binds to them and " +
                "causes the shark to emerge at their position. The lure's holder is Slow icon" +
                " slowed for the duration and Airborne icon knocked up for 1 second instead of away.");
    }

    private void wireWidgets(View rootView) {
        textViewName = rootView.findViewById(R.id.textView_rFragment_name);
        textViewCost = rootView.findViewById(R.id.textView_rFragment_cost);
        textViewRange = rootView.findViewById(R.id.textView_rFragment_range);
        textViewCostNum = rootView.findViewById(R.id.textView_rFragment_costNumber);
        textViewRangeNum = rootView.findViewById(R.id.textView_rFragment_rangeNumber);

        textViewDescription = rootView.findViewById(R.id.textView_rFragment_description);
    }
}
