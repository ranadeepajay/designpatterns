package org.example.services.computeImpl;

import org.example.services.ComputeService;

public class GCPComputeService implements ComputeService {
    @Override
    public void start() {
        System.out.println("GCP service started");
    }

    @Override
    public void stop() {
        System.out.println("GCP service stopped");

    }
}
