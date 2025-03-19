package org.example;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String string) {
        System.out.println("SMS service: " + string);
    }
}
