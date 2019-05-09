package com.nice.thread3;

import com.nice.thread3.Main;

public class Sub extends Main {
    synchronized public void operateISubMethod(){
        try{
            while (i>0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
