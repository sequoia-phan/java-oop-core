package org.example;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;

public class IncomingReader implements Runnable {
    BufferedReader reader;
    JTextArea inComing;
    @Override
    public void run() {
        String message;
        try {
            while((message = reader.readLine()) != null) {
                System.out.println("read " + message);
                this.inComing.append(message + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
