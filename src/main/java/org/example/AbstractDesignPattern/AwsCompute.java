package org.example.AbstractDesignPattern;

public class AwsCompute implements ComputeInstance{
    @Override
    public void start() {
        System.out.println("using aws for computing started");
    }

    @Override
    public void stop() {
        System.out.println("using aws for computing stop");
    }
}
