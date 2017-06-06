package com.shellcore.java.threads;

/**
 * Thread 2 implementation
 * Created by Cesar. 06/06/2017.
 */
public class ThreadAltObject implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from thread 2");

        // Example for looping a mesasge in 1.2 seconds
        /*for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1200); // Sleep for 1.2 second
            } catch (InterruptedException e) {
                System.out.println("Thread 2 has been interrupted");
                Thread.currentThread()
                        .interrupt();
            }
            System.out.println("Count from thread 1 - " + i);
        }*/

        for (int i = 0; i < 2_147_483_647; i++) {
            if (i%10_000_000 == 0) {
                System.out.println("Count from thread 2 - " + i);

                if (Thread.interrupted()) {
                    System.out.println("Thread 2 has been interrupted");
                    break;
                }
            }
        }
    }
}
