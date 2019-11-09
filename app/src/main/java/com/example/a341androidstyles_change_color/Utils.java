package com.example.a341androidstyles_change_color;

import android.content.Intent;

public class Utils {

    private static int sTheme;

    public final static int THEME_DEFAULT = 0;
    public final static int THEME_BLACK = 1;
    public final static int THEME_GREEN = 2;
    public final static int THEME_BLUE  = 3;

    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToTheme(MainActivity activity, int theme)
    {
        sTheme = theme;
        activity.finish();

        activity.startActivity(new Intent(activity, activity.getClass()));

    }

    /** Set the theme of the activity, according to the configuration. */
    public static void onActivityCreateSetTheme(MainActivity activity)
    {
        switch (sTheme)
        {
            default:
            case THEME_DEFAULT:
                activity.setTheme(R.style.AppTheme);
                break;
            case THEME_BLACK:
                activity.setTheme(R.style.Black);
                break;
            case THEME_GREEN:
                activity.setTheme(R.style.Green);
                break;
            case THEME_BLUE:
                activity.setTheme(R.style.Blue);
                break;
        }
    }
}