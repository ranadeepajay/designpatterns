package org.example.AbstractDesignPattern;

public class AwsStorage implements  StorageInstance{
    @Override
    public void store() {
        System.out.println("aws storage used");
    }
}
