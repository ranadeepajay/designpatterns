package org.example.AbstractDesignPattern.Factories;

import org.example.AbstractDesignPattern.AwsCompute;
import org.example.AbstractDesignPattern.AwsStorage;
import org.example.AbstractDesignPattern.ComputeInstance;
import org.example.AbstractDesignPattern.StorageInstance;

public class AwsProvideServices implements ProvideServices {
    @Override
    public StorageInstance giveStorageIns() {
        return new AwsStorage();
    }

    @Override
    public ComputeInstance giveComputeIns() {
        return new AwsCompute();
    }
}
