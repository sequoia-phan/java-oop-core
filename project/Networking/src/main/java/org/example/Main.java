package org.example;

import org.example.ThreadJava.BankAccount;
import org.example.ThreadJava.PeopleJob;

public class Main {
    public static void main(String[] args) {
//        DailyAdviceServer server = new DailyAdviceServer();
//        server.go();
//        DailyAdviceClient client = new DailyAdviceClient();
//        client.go();
        ChatClient chatClient = new ChatClient();
        chatClient.go();

//        Runnable threadJob = new MyRunnable();
//        Thread myThread = new Thread(threadJob);
//        Thread myThread2 = new Thread(threadJob);
//        myThread.setName("thread 1");
//        myThread2.setName("thread 2");
//
//        myThread.start();
//        myThread2.start();

//        PeopleJob job = new PeopleJob(new BankAccount(100));
//        Thread thread1 = new Thread(job);
//        Thread thread2 = new Thread(job);
//        thread1.setName("Nhat");
//        thread2.setName("Meow");
//        thread1.start();
//        thread2.start();

        System.out.println("Back to the main");
    }
}