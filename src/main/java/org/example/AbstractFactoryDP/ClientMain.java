package org.example.AbstractFactoryDP;

import org.example.AbstractFactoryDP.Factory.Impl.AwsServiceFactory;
import org.example.AbstractFactoryDP.Factory.Impl.GCPServiceFactory;
import org.example.AbstractFactoryDP.Factory.ServiceFactory;
import org.example.AbstractFactoryDP.Services.ComputeService;
import org.example.AbstractFactoryDP.Services.StorageService;

public class ClientMain {
    public static void main(String[] args) {

        ServiceFactory serviceFactory=new AwsServiceFactory();
        ComputeService awsComputeService=serviceFactory.getComputeService();
        awsComputeService.start();
        awsComputeService.stop();

        StorageService awsStorageService=serviceFactory.getStorageService();
        awsStorageService.storageAllocated(10);


        serviceFactory=new GCPServiceFactory();
        ComputeService GCPCompute=serviceFactory.getComputeService();
        GCPCompute.start();
        GCPCompute.stop();

        StorageService gcpStorage=serviceFactory.getStorageService();
        gcpStorage.storageAllocated(10);








    }
}
