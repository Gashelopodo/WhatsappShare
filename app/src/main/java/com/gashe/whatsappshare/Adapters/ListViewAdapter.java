package com.gashe.whatsappshare.Adapters;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.gashe.whatsappshare.R;

import java.util.ArrayList;

/**
 * Created by Gashe on 17/3/17.
 */

public class ListViewAdapter extends BaseAdapter {

    private String[] comments;
    private Context context;

    public ListViewAdapter(String[] comments, Context context) {
        this.comments = comments;
        this.context = context;
    }

    @Override
    public int getCount() {
        Log.d(getClass().getCanonicalName(), "lengh: " + comments.length);
        return comments.length;
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

        View element = null;
        Activity activity = (Activity)context;

        LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
        element = layoutInflater.inflate(R.layout.row_comment, viewGroup, false);

        TextView textView = (TextView)element.findViewById(R.id.myTextComment);
        textView.setText(comments[i]);
        TextView num = (TextView)element.findViewById(R.id.myNumComment);
        num.setText("" + (i+1));

        return element;
    }
}
