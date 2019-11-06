package com.example.a341androidstyles_change_color;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Spinner mLanguageSpinner;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)     {

        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonDefault).setOnClickListener(this);
        findViewById(R.id.buttonBlack).setOnClickListener(this);
        findViewById(R.id.buttonGreen).setOnClickListener(this);
        findViewById(R.id.buttonBlue).setOnClickListener(this);
        findViewById(R.id.button).setOnClickListener(this);

        mLanguageSpinner = findViewById(R.id.languageSpinner);

    }

    @Override
    public void onClick(View v)     {
        // TODO Auto-generated method stub
        switch (v.getId())
        {

            case R.id.buttonDefault:
                Utils.changeToTheme(this, Utils.THEME_DEFAULT);
                break;
            case R.id.buttonBlack:
                Utils.changeToTheme(this, Utils.THEME_BLACK);
                break;
            case R.id.buttonGreen:
                Utils.changeToTheme(this, Utils.THEME_GREEN);
                break;
            case R.id.buttonBlue:
                Utils.changeToTheme(this, Utils.THEME_BLUE);
                break;
            case R.id.button:
                Toast.makeText(MainActivity.this, mLanguageSpinner.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
                Locale locale;
                if (mLanguageSpinner.getSelectedItem().toString().equals("English")) {
                    locale = new Locale("en");
                } else {
                    locale = new Locale("ru");
                }
                Configuration config = new Configuration();
                config.setLocale(locale);
                getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                recreate();
                break;
        }
    }


}


