package com.example.juleeyahwright.opensesame.Common;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import com.example.juleeyahwright.opensesame.Common.Constant;
import com.example.juleeyahwright.opensesame.Common.Theme;

public class BaseActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences, appPreferences;
    SharedPreferences.Editor editor;
    int appTheme;
    int appColor;
    int themeColor;
    Constant constant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        appPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        appTheme = appPreferences.getInt("theme", 0);
        appColor = appPreferences.getInt("color", 0);
        themeColor = appColor;
        constant.color = appColor;

        if (appColor == 0 || themeColor == 0) {
            setTheme(Constant.appTheme);
        } else
            setTheme(appTheme);

        Theme.setColorTheme();
    }

}
