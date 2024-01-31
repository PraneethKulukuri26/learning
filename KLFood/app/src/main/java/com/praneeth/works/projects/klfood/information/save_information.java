package com.praneeth.works.projects.klfood.information;

import android.content.Context;
import android.content.SharedPreferences;

public class save_information {

    SharedPreferences sharedPreferences;
    public save_information(Context context)
    {
        sharedPreferences=context.getSharedPreferences("KLFood_your",Context.MODE_PRIVATE);
    }

    public void save_User(String str)
    {
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putString("user",str);
        editor.apply();
    }

    public String load_user()
    {
        return sharedPreferences.getString("user","");
    }

}
