package com.shellcore.java.threads;

/**
 * Created by Cesar. 06/06/2017.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Threads creation
        Thread thread1 = new ThreadObject();
        Thread thread2 = new Thread(new ThreadAltObject());

//        thread1.start();
        thread2.start();

        // Para interrumpir los hilos de ejecución
        /*Thread.sleep(1500);
        thread1.interrupt();
        thread2.interrupt();*/

        thread2.join();
        System.out.println("Main thread will continue");
    }
}
