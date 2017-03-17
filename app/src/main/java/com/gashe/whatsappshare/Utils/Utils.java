package com.gashe.whatsappshare.Utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.gashe.whatsappshare.R;
import com.gashe.whatsappshare.Adapters.ViewPagerAdapter;

/**
 * Created by Gashe on 17/3/17.
 */

public class Utils {


    public void saveComment(String text, Context context){

        final SharedPreferences prefs = context.getSharedPreferences("prefs", Context.MODE_PRIVATE);
        int length = prefs.getInt("total", -1);
        SharedPreferences.Editor editor = prefs.edit();

        length++;
        editor.putInt("total", length);

        editor.putString("comment" + length, text);
        editor.commit();

    }

    public String[] getComments(Context context){

        final SharedPreferences prefs = context.getSharedPreferences("prefs", Context.MODE_PRIVATE);
        int length = prefs.getInt("total", -1);
        String[] comments = new String[length+1];

        for(int i = 0; i <= length; i++){
            String comment = prefs.getString("comment" + i, "");
            Log.d(getClass().getCanonicalName(), "string: " + comment);
            comments[i] = comment;
        }

        return comments;

    }

    public ViewPager createViewPagerAndTabs(Context context, FragmentManager fm){

        Activity activity = (Activity)context;

        ViewPager viewPager = (ViewPager)activity.findViewById(R.id.myCustomViewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(fm);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout)activity.findViewById(R.id.myTabLayout);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.write);
        tabLayout.getTabAt(1).setIcon(R.drawable.list);

        return viewPager;

    }

    public void sendWhatsapp(Context context, String text){

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, text);
        sendIntent.setType("text/plain");
        sendIntent.setPackage("com.whatsapp");
        context.startActivity(sendIntent);

    }


}
