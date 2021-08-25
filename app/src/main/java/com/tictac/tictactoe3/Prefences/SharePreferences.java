package com.tictac.tictactoe3.Prefences;

import android.content.Context;
import android.content.SharedPreferences;

public class SharePreferences {
    private final String SHARE_PREFERENCES ="State";
    private final Context context;

    public SharePreferences(Context context) {
        this.context = context;
    }



    public void Save_state(int state){
        SharedPreferences sharedPreferences= context.getSharedPreferences(SHARE_PREFERENCES,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putInt(SHARE_PREFERENCES,state);
        editor.apply();
    }

    public int Load_state(){
        SharedPreferences sharedPreferences= context.getSharedPreferences(SHARE_PREFERENCES,Context.MODE_PRIVATE);
        return sharedPreferences.getInt(SHARE_PREFERENCES,1);
    }


}
