package org.example.ThreadJava;

public class ThreadTest extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(System.currentTimeMillis() + " - " +
                    Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CheckConcurrency {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        ThreadTest thread1 = new ThreadTest();
        ThreadTest thread2 = new ThreadTest();

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + " ms");
    }
}
