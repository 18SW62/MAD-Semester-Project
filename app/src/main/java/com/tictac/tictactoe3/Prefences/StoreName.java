package com.tictac.tictactoe3.Prefences;

import android.content.Context;
import android.content.SharedPreferences;

public class StoreName {
    private final String NAME_PREFERENCES ="Name";
    private final Context context;

    public StoreName(Context context) {
        this.context = context;
    }



    public void Save_state(String state){
        SharedPreferences sharedPreferences= context.getSharedPreferences(NAME_PREFERENCES,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putString(NAME_PREFERENCES,state);
        editor.apply();
    }

    public String Load_state(){
        SharedPreferences sharedPreferences= context.getSharedPreferences(NAME_PREFERENCES,Context.MODE_PRIVATE);
        return sharedPreferences.getString(NAME_PREFERENCES,null);
    }


}
