package com.gashe.whatsappshare;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by Gashe on 17/3/17.
 */

public class FragmentWriteComment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = null;
        view = inflater.inflate(R.layout.fragment_write_comment, container, false);

        ImageButton imageButton = (ImageButton)view.findViewById(R.id.myImageButton);
        imageButton.setOnClickListener(new ListenerButton());

        return view;
    }
}
