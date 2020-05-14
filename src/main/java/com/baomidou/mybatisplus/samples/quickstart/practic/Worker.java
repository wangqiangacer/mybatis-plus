package com.baomidou.mybatisplus.samples.quickstart.practic;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

import static com.baomidou.mybatisplus.samples.quickstart.practic.CountDownLatchDemo.sdf;


public class Worker extends Thread {
    String workerName;
    int workTime;
    CountDownLatch latch;
    public Worker(String workerName ,int workTime ,CountDownLatch latch){
        this.workerName=workerName;
        this.workTime=workTime;
        this.latch=latch;
    }
    public void run(){
        System.out.println("Worker "+workerName+" do work begin at "+sdf.format(new Date()));
        doWork();//工作了
        System.out.println("Worker "+workerName+" do work complete at "+sdf.format(new Date()));
        latch.countDown();//工人完成工作，计数器减一

    }

    private void doWork(){
        try {
            Thread.sleep(workTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

