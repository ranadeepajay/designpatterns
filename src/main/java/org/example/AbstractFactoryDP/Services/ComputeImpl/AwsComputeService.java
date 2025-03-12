package org.example.AbstractFactoryDP.Services.ComputeImpl;

import org.example.AbstractFactoryDP.Services.ComputeService;

public class AwsComputeService implements ComputeService {
    @Override
    public void start() {
        System.out.println("aws compute service started");
    }

    @Override
    public void stop() {
        System.out.println("aws compute service stopped");

    }
}
