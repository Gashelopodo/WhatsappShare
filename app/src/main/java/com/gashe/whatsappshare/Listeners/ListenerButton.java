package com.gashe.whatsappshare.Listeners;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.EditText;

import com.gashe.whatsappshare.R;
import com.gashe.whatsappshare.Utils.Utils;

/**
 * Created by Gashe on 17/3/17.
 */

public class ListenerButton implements View.OnClickListener {

    private Context context;

    public ListenerButton(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.myImageButton:

                Activity activity = (Activity)context;
                FragmentActivity fm = (FragmentActivity)context;
                EditText editText = (EditText) activity.findViewById(R.id.myCustomText);
                String text = editText.getText().toString();

                Utils utils = new Utils();
                utils.saveComment(text, context);
                editText.setText("");

                ViewPager viewPager = utils.createViewPagerAndTabs(context, fm.getSupportFragmentManager());
                viewPager.setCurrentItem(2);

                utils.sendWhatsapp(context, text);

                break;
            default: //nada
        }

    }
}
