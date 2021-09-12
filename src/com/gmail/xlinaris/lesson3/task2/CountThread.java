package com.gmail.xlinaris.lesson3.task2;

import java.util.concurrent.locks.ReentrantLock;

class CountThread implements Runnable {

    private Resource resource;
    private ReentrantLock lock;

    public CountThread(Resource r, ReentrantLock reentrantLocker) {
        this.resource = r;
        this.lock = reentrantLocker;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            resource.count();
        } finally {
            lock.unlock();
        }
    }
}
