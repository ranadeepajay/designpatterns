package org.example.services.StorageImpl;

import org.example.services.StorageService;

public class AwsStorageService implements StorageService {
    @Override
    public void storage(int data) {
        System.out.println("aws used "+data);
    }
}
