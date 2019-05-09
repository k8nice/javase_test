package com.nice.thread1;

public class ThreadA extends Thread{
    private PublicCar publicCar;

    public ThreadA(PublicCar publicCar){
        super();
        this.publicCar = publicCar;
    }
    @Override
    public void run() {
        super.run();
        publicCar.setValue("nice","smile");
    }
}
