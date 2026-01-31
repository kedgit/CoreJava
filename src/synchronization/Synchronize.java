package synchronization;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    AtomicInteger count = new AtomicInteger(0);

    void increment() {
        count.incrementAndGet(); // thread-safe
    }

    
}


class MyThread extends Thread {
    Counter c;

    MyThread(Counter c) {
        this.c = c;
    }

    public void run() {
        for(int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

public class Synchronize {
	
    public static void main(String[] args) throws Exception {
    	
        Counter c = new Counter();

        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);
        MyThread t3 = new MyThread(c);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(c.count); // Output: 2000
    }
}
