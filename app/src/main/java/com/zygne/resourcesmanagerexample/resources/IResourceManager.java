package com.zygne.resourcesmanagerexample.resources;

/**
 * Created by Bardur Thomsen on 7/4/18.
 */
public interface IResourceManager {

    boolean checkInitialization();

    String getString(int stringId);

    Object getSystemService(String serviceId);

}
