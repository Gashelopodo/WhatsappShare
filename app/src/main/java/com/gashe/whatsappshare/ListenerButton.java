package com.gashe.whatsappshare;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Gashe on 17/3/17.
 */

public class ListenerButton implements View.OnClickListener {

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.myImageButton:

                EditText editText = (EditText)view.findViewById(R.id.myCustomText);
                Utils utils = new Utils();
                utils.saveComment(editText.getText().toString(), view.getContext());

                ViewPager viewPager = (ViewPager)view.findViewById(R.id.myCustomViewPager);
                viewPager.setCurrentItem(2);

                break;
            default: //nada
        }

    }
}
