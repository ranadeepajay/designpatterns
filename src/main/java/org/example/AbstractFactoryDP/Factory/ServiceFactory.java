package org.example.AbstractFactoryDP.Factory;

import org.example.AbstractFactoryDP.Services.ComputeService;
import org.example.AbstractFactoryDP.Services.StorageService;

public interface ServiceFactory {
    public ComputeService getComputeService();
    public StorageService getStorageService();
}
