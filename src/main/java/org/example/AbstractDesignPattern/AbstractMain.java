package org.example.AbstractDesignPattern;

import org.example.AbstractDesignPattern.Factories.AwsProvideServices;
import org.example.AbstractDesignPattern.Factories.GCPProvideServices;
import org.example.AbstractDesignPattern.Factories.ProvideServices;

public class AbstractMain {
    public static void main(String[] args) {
        // aws service provide
        ProvideServices provideServices=new AwsProvideServices();
        StorageInstance storageInstance=provideServices.giveStorageIns();
        ComputeInstance computeInstance=provideServices.giveComputeIns();
        storageInstance.store();
        computeInstance.start();
        computeInstance.stop();

        System.out.println("switch storage services");

        ProvideServices provideServices1=new GCPProvideServices();
        StorageInstance storageInstance1=provideServices.giveStorageIns();
        ComputeInstance computeInstance1=provideServices.giveComputeIns();
        storageInstance1.store();
        computeInstance1.start();
        computeInstance1.stop();




    }
}
