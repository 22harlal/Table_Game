package com.example.tablegame;

import android.view.View;
import android.widget.ImageView;

public class tableBuildClick extends MainActivity{

    public void tableBuildClick(View view) {
        buildTableButtonPosition = buildTableButtonPosition + 1;
        if(buildTableButtonPosition == 3){
        buildTableButtonPosition = 1;
        totalMoney = totalMoney + 10;
        }
            else if(buildTableButtonPosition == 1){
            TableImageTwo.setVisibility(View.INVISIBLE);
            TableImageOne.setVisibility(View.VISIBLE);
        }
            else if(buildTableButtonPosition == 2){
                TableImageOne.setVisibility(View.INVISIBLE);
                TableImageTwo.setVisibility(View.VISIBLE);
        }
    }
}
