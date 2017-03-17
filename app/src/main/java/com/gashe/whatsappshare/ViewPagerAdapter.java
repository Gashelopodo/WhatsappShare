package com.gashe.whatsappshare;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Gashe on 17/3/17.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment;
        switch (position){
            case 0: fragment = new FragmentWriteComment();
                break;
            case 1: fragment = new FragmentListComments();
                break;
            default: fragment = null;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
