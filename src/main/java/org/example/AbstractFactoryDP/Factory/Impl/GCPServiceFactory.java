package org.example.AbstractFactoryDP.Factory.Impl;

import org.example.AbstractFactoryDP.Factory.ServiceFactory;
import org.example.AbstractFactoryDP.Services.ComputeImpl.GCPComputeService;
import org.example.AbstractFactoryDP.Services.ComputeService;
import org.example.AbstractFactoryDP.Services.StorageImpl.GCPStorageService;
import org.example.AbstractFactoryDP.Services.StorageService;

public class GCPServiceFactory implements ServiceFactory {
    @Override
    public ComputeService getComputeService() {
        return  new GCPComputeService();
    }

    @Override
    public StorageService getStorageService() {
        return  new GCPStorageService();
    }
}
