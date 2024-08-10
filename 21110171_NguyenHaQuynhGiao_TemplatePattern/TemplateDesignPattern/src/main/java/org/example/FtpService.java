package org.example;

public class FtpService extends NetworkService{
    @Override
    protected void establishConnect() {
        System.out.println("Establishing Ftp connect.");
    }

    @Override
    protected boolean authenticate() {
        System.out.println("Authenticating Ftp connect.");
        return true;
    }

    @Override
    protected void execute(String request) {
        System.out.println("Executing Ftp connect.");
    }

    @Override
    protected void closeConnection() {
        System.out.println("Closing Ftp connect.");
    }
}
