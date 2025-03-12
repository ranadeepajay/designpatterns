package org.example.AbstractFactoryDP;

import org.example.AbstractFactoryDP.Services.ComputeImpl.AwsComputeService;
import org.example.AbstractFactoryDP.Services.ComputeImpl.GCPComputeService;
import org.example.AbstractFactoryDP.Services.ComputeService;
import org.example.AbstractFactoryDP.Services.StorageImpl.AwsStorageService;
import org.example.AbstractFactoryDP.Services.StorageImpl.GCPStorageService;
import org.example.AbstractFactoryDP.Services.StorageService;

public class ProvideService {

    public ComputeService getComputeService(String choice){
        switch (choice){
            case "aws":
                return  new AwsComputeService();
            case "GCP":
                return  new GCPComputeService();


        }

        return  null;
    }
    public StorageService getStorageService(String choice){
        switch (choice){
            case "aws":
                return  new AwsStorageService();
            case "GCP":
                return  new GCPStorageService();


        }

        return  null;
    }




}
