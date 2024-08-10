package org.example;

public class HttpService extends NetworkService{
    @Override
    protected void establishConnect() {
        System.out.println("Establishing Http connect.");
    }

    @Override
    protected boolean authenticate() {
        System.out.println("Authenticating Http connect.");
        return true;
    }

    @Override
    protected void execute(String request) {
        System.out.println("Executing Http connect.");
    }

    @Override
    protected void closeConnection() {
        System.out.println("Closing Http connect.");
    }
}
