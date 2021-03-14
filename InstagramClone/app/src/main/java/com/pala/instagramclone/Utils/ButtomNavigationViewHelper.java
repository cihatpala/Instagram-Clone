package com.pala.instagramclone.Utils;

import android.util.Log;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.pala.instagramclone.R;


public class ButtomNavigationViewHelper {
    private static final String TAG = "ButtomNavigationViewHel";
    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: Setting up ButtomNavigationView");

        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }
}
