package com.hit.pretstreet.pretstreet;

import android.app.Application;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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
}
