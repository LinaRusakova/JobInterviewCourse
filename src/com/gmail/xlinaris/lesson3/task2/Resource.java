package com.gmail.xlinaris.lesson3.task2;

class Resource {

    int x = 0;

    public void count() {
        x++;
        System.out.println(Thread.currentThread().getName() + " запустил счетчик, результат =  " + x);
    }
}
