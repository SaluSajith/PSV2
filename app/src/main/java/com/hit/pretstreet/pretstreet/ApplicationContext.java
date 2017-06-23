package com.hit.pretstreet.pretstreet;

import android.app.Application;
import android.content.Context;

import com.hit.pretstreet.pretstreet.core.managers.PreferenceManager;

/**
 * Created by User on 6/20/2017.
 */

public class ApplicationContext extends Application {

    private static ApplicationContext mInstance;

    public static ApplicationContext getApplicationInstance() {
        return mInstance;
    }

    public static Context getContext() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        //  LeanTesting.init(this, "NYRaiydnBh8EiUvKFvZhbVql9EGyHAAVoIs1Obmp", 16766);
       // FlowManager.init(new FlowConfig.Builder(this).build());//initialize DBFlow

        //Singleton SharedPreference
        PreferenceManager.getInstance().setPreferencesHelper(this);
    }
    public static int getStatusBarHeight(Context context) {
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }
}
