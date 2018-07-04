package com.zygne.resourcesmanagerexample.resources;

import android.content.Context;
import android.util.Log;

/**
 * Created by Bardur Thomsen on 7/4/18.
 */
public class ResourceManager implements IResourceManager {

    private static final String TAG = ResourceManager.class.getSimpleName();

    private Context context = null;

    private static volatile ResourceManager instance;

    public synchronized static ResourceManager getInstance(){

        if (instance == null) {

            synchronized (ResourceManager.class) {

                if (instance == null){
                    instance = new ResourceManager();
                }
            }
        }

        return instance;
    }

    private ResourceManager() {

        if(instance != null){
            throw new RuntimeException("use getInstance() to get access to the instance of the class!");
        }
    }

    public void init(Context context){
        this.context = context;
    }

    @Override
    public boolean checkInitialization(){

        boolean valid = true;

        if(context == null){

            valid = false;
            Log.e(TAG, "Class not set up properly. Call init(Context) to set up.");
        }

        return valid;
    }

    @Override
    public String getString(int id){

        String result = "";

        if(checkInitialization()) {

            try {
                result = context.getString(id);
            } catch (Exception e) {
                Log.e(TAG, "could not load resource " + id, e);
            }
        }

        return result;
    }

    @Override
    public Object getSystemService(String serviceId) {
        return context.getSystemService(serviceId);
    }

}
