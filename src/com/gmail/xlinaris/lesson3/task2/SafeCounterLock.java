package com.gmail.xlinaris.lesson3.task2;

import java.util.concurrent.locks.ReentrantLock;

public class SafeCounterLock {
    public static void main(String[] args) {
        Resource resource = new Resource();
        ReentrantLock locker = new ReentrantLock();
        for (int i = 1; i < 10; i++) {
            Thread t = new Thread(new CountThread(resource, locker));
            t.setName("Thread " + i);
            t.start();
        }
    }
}

