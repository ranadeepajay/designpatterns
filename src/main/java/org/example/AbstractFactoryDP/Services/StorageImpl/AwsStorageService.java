package org.example.AbstractFactoryDP.Services.StorageImpl;

import org.example.AbstractFactoryDP.Services.StorageService;

public class AwsStorageService implements StorageService {
    @Override
    public void storageAllocated(int size) {
        System.out.println("AWS allocated storage:"+size);
    }
}
