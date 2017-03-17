package com.gashe.whatsappshare;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Gashe on 17/3/17.
 */

public class ListViewAdapter extends BaseAdapter {

    private ArrayList<String> comments;

    public ListViewAdapter(ArrayList<String> comments) {
        this.comments = comments;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
