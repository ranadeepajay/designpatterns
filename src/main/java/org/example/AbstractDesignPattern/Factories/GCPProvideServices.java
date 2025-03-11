package org.example.AbstractDesignPattern.Factories;

import org.example.AbstractDesignPattern.ComputeInstance;
import org.example.AbstractDesignPattern.GCPCompute;
import org.example.AbstractDesignPattern.GCPstorage;
import org.example.AbstractDesignPattern.StorageInstance;

public class GCPProvideServices implements ProvideServices {
    @Override
    public StorageInstance giveStorageIns() {
        return new GCPstorage();
    }

    @Override
    public ComputeInstance giveComputeIns() {
        return new GCPCompute();
    }
}
