package org.example.services.computeImpl;

import org.example.services.ComputeService;

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
