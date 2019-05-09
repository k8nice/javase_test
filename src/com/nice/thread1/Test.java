package com.nice.thread1;

public class Test {
    public static void main(String[] args) {
        PublicCar publicCar = new PublicCar();
        try {
            ThreadA threadA = new ThreadA(publicCar);
            threadA.start();
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        publicCar.getValue();
    }
}
