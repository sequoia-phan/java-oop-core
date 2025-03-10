package org.example;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        this.go();
    }

    public void go() {
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        this.doMore();
    }

    public void doMore() {
        for (int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running " + (i + 1) + " times");
        }
    }
}
