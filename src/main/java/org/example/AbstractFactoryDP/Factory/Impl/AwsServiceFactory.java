package org.example.AbstractFactoryDP.Factory.Impl;

import org.example.AbstractFactoryDP.Factory.ServiceFactory;
import org.example.AbstractFactoryDP.Services.ComputeImpl.AwsComputeService;
import org.example.AbstractFactoryDP.Services.ComputeService;
import org.example.AbstractFactoryDP.Services.StorageImpl.AwsStorageService;
import org.example.AbstractFactoryDP.Services.StorageService;

public class AwsServiceFactory implements ServiceFactory {


    @Override
    public ComputeService getComputeService() {
        return  new AwsComputeService();
    }

    @Override
    public StorageService getStorageService() {
        return  new AwsStorageService();
    }
}
