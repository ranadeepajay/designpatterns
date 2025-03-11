package org.example.AbstractDesignPattern.Factories;

import org.example.AbstractDesignPattern.ComputeInstance;
import org.example.AbstractDesignPattern.StorageInstance;

public interface ProvideServices {
    public StorageInstance giveStorageIns();
    public ComputeInstance giveComputeIns();
}
