package com.zygne.resourcesmanagerexample.base;

import android.app.Application;

import com.zygne.resourcesmanagerexample.resources.ResourceManager;

/**
 * Created by Bardur Thomsen on 7/4/18.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // initialize the resource manager
        ResourceManager.getInstance().init(getApplicationContext());
    }
}
