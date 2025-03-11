package org.example.services.StorageImpl;

import org.example.services.StorageService;

public class GCPStorageService implements StorageService {
    @Override
    public void storage(int data) {
        System.out.println("GCP used "+data+" ");
    }
}
