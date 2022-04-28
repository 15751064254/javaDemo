package src;

public class DeadlockDemo {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    // jstack 8902 > jstack_deadlock.log
    public static void main(String[] args) {

        new Thread(){
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("Thread1 get lock1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock2){
                        System.out.println("Thread1 get lock2");
                    }
                    System.out.println("Thread1 end");
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                synchronized (lock2){
                    System.out.println("Thread2 get lock2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock1){
                        System.out.println("Thread2 get lock1");
                    }
                    System.out.println("Thread2 end");
                }
            }
        }.start();
    }
}
