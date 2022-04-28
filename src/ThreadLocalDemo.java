package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadLocalDemo {
    ThreadLocal<Long> longThreadLocal = new ThreadLocal<>();
    ThreadLocal<String> stringThreadLocal = new ThreadLocal<>();

    public void set(){
        longThreadLocal.set(Thread.currentThread().getId());
        stringThreadLocal.set(Thread.currentThread().getName());
    }

    public ThreadLocal<Long> getLongThreadLocal() {
        return longThreadLocal;
    }

    public void setLongThreadLocal(ThreadLocal<Long> longThreadLocal) {
        this.longThreadLocal = longThreadLocal;
    }

    public ThreadLocal<String> getStringThreadLocal() {
        return stringThreadLocal;
    }

    public void setStringThreadLocal(ThreadLocal<String> stringThreadLocal) {
        this.stringThreadLocal = stringThreadLocal;
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadLocalDemo threadLocalDemo = new ThreadLocalDemo();
        threadLocalDemo.set();

        System.out.println(threadLocalDemo.getLongThreadLocal().get());
        System.out.println(threadLocalDemo.getStringThreadLocal().get());


        Thread thread1 = new Thread() {
            @Override
            public void run() {
                super.run();
                threadLocalDemo.set();
                System.out.println(threadLocalDemo.getLongThreadLocal().get());
                System.out.println(threadLocalDemo.getStringThreadLocal().get());
            }
        };
        thread1.start();
        thread1.join();
        System.out.println(threadLocalDemo.getLongThreadLocal().get());
        System.out.println(threadLocalDemo.getStringThreadLocal().get());

    }
}
