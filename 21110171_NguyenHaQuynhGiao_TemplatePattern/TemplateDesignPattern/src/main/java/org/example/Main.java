package org.example;

public class Main {
    public static void main(String[] args) {
        NetworkService http = new HttpService();
        NetworkService ftp = new FtpService();

        http.handlerRequest("Get /home");
        ftp.handlerRequest("Get /file");
    }
}