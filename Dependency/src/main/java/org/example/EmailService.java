package org.example;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String string) {
        System.out.println("Email service: "+string);
    }
}
