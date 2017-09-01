package Threads;

/**
 * Created by Violetta on 2017-08-30.
 */
public class Deadlock {

    public static void main(String[] args) {
        final A a = new A();
        final B b = new B();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a) {
                    // делаем задержку, чтобы оба потока могли начать блокирование мноторов у обоих объектов
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // Thread-1 занял монитор a, но также нуждается и в b
                    synchronized (b) {
                        System.out.println("In block 1");
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (b) {
                    // Thread-1 занял монитор b, но также нуждается и в a
                    synchronized (a) {
                        System.out.println("In block 2");
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }

}

class A {
}

class B {
}
