package com.shellcore.java.threads;

/**
 * Thread 1 implementation
 * Created by Cesar. 06/06/2017.
 */
public class ThreadObject extends Thread {

    @Override
    public void run() {
        // Thread logic
        System.out.println("Hello from thread 1");

        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread 1 has been interrupted");

                // Si se quita esta linea, el hilo no se interrumpe
                Thread.currentThread()
                        .interrupt();
            }
            System.out.println("Count from thread 1 - " + i);
        }
    }
}
