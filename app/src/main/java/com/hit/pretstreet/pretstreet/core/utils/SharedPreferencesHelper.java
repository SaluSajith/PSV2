package com.hit.pretstreet.pretstreet.core.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by User on 6/20/2017.
 */

public class SharedPreferencesHelper {

    Context mContext;

    public SharedPreferencesHelper(Context mContext) {
        if (mContext != null)
            this.mContext = mContext;
    }

    public void putInt(String key, int value) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putInt(key, value);
        edit.apply();
    }

    public void putBoolean(String key, boolean val) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putBoolean(key, val);
        edit.apply();
    }

    public void putString(String key, String val) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putString(key, val);
        edit.apply();
    }

    public void putFloat(String key, float val) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putFloat(key, val);
        edit.apply();
    }

    public void putLong(String key, long val) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putLong(key, val);
        edit.apply();
    }

    public long getLong(String key, long _default) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext);
        return preferences.getLong(key, _default);
    }

    public float getFloat(String key, float _default) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext);
        return preferences.getFloat(key, _default);
    }

    public String getString(String key, String _default) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext);
        return preferences.getString(key, _default);
    }

    public int getInt(String key, int _default) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext);
        return preferences.getInt(key, _default);
    }

    public boolean getBoolean(String key, boolean _default) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext);
        return preferences.getBoolean(key, _default);
    }

    public void clearPreferences() {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext);
        preferences.edit().clear().apply();
    }
}
