package com.gmail.xlinaris.lesson3.task1;

public class PingPongTest {

    private boolean monitor;

    public static void main(String[] args) {
        PingPongTest pingPong = new PingPongTest();
        new Thread(pingPong::ping).start();
        new Thread(pingPong::pong).start();
    }

    public synchronized void ping() {
        for (int i = 0; i < 10; i++) {
            try {
                if (monitor) {
                    wait();
                }
                monitor = !monitor;
                System.out.println("Ping!");
                notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void pong() {
        for (int i = 0; i < 10; i++) {
            try {
                if (!monitor) {
                    wait();
                }
                monitor = !monitor;
                System.out.println("Pong!");
                notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

