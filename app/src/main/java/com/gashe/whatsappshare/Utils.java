package com.gashe.whatsappshare;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;

/**
 * Created by Gashe on 17/3/17.
 */

public class Utils {


    public void saveComment(String text, Context context){

        final SharedPreferences prefs = context.getSharedPreferences("prefs", Context.MODE_PRIVATE);
        int length = prefs.getInt("total", 0);
        SharedPreferences.Editor editor = prefs.edit();

        if(length == 0){
            editor.putInt("total", 1);
            length = 1;
        }else{
            length++;
            editor.putInt("total", length);
        }

        editor.putString("comment" + length, text);
        editor.commit();

    }

    public ArrayList<String> getComments(Context context){

        ArrayList<String> comments = null;
        final SharedPreferences prefs = context.getSharedPreferences("prefs", Context.MODE_PRIVATE);
        int length = prefs.getInt("total", 0);

        for(int i = 0; i < length; i++){
            
        }

        return comments;

    }


}
