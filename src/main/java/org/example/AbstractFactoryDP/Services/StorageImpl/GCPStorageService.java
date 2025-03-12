package org.example.AbstractFactoryDP.Services.StorageImpl;

import org.example.AbstractFactoryDP.Services.StorageService;

public class GCPStorageService implements StorageService {
    @Override
    public void storageAllocated(int size) {
        System.out.println("GCP allocated storage:"+size);
    }
}
