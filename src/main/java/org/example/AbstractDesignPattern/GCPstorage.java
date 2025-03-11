package org.example.AbstractDesignPattern;

public class GCPstorage implements StorageInstance{
    @Override
    public void store() {
        System.out.println("GCP storage used");
    }
}
