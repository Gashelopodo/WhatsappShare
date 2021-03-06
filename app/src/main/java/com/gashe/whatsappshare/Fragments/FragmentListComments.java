package com.gashe.whatsappshare.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.gashe.whatsappshare.Adapters.ListViewAdapter;
import com.gashe.whatsappshare.R;
import com.gashe.whatsappshare.Utils.Utils;

/**
 * Created by Gashe on 17/3/17.
 */

public class FragmentListComments extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = null;
        view = inflater.inflate(R.layout.fragment_list_comments, container, false);

        String[] comments;
        Utils utils = new Utils();
        comments = utils.getComments(getContext());

        ListView listView = (ListView)view.findViewById(R.id.myListView);
        ListViewAdapter adapter = new ListViewAdapter(comments, getContext());
        listView.setAdapter(adapter);

        return view;

    }
}
