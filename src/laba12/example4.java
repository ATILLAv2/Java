package laba12;

public class example4 {
    private static final Object lock = new Object();
    private static int number = 1;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];

        for (int i = 1; i <= 10; i++) {
            int tNumber = i;
            Thread t = new Thread(() -> {
                synchronized (lock) {
                    while (number != tNumber) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Поток " + tNumber);
                    number++;
                    lock.notifyAll();
                }
            });
            threads[i - 1] = t;
            t.start();
            t.join();
        }
    }
}
