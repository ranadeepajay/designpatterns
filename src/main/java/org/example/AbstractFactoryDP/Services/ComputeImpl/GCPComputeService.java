package org.example.AbstractFactoryDP.Services.ComputeImpl;

import org.example.AbstractFactoryDP.Services.ComputeService;

public class GCPComputeService implements ComputeService {
    @Override
    public void start() {
        System.out.println("GCP compute service started");
    }

    @Override
    public void stop() {
        System.out.println("GCP compute service stoped");

    }
}
