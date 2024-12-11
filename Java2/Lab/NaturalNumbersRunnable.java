package Java2.Lab;

class NaturalNumbers implements Runnable {
    private String threadName;

    public NaturalNumbers(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + " is printing first 5 natural numbers:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
        }
    }
}

public class NaturalNumbersRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NaturalNumbers("Thread-1"));
        Thread t2 = new Thread(new NaturalNumbers("Thread-2"));
        Thread t3 = new Thread(new NaturalNumbers("Thread-3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
