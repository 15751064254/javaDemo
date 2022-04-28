package src;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MonitorThread {

    public static final String RED_S = "\033[31;4m";
    public static final String RED_E = "\033[0m";

    public static List<Thread> threadArrayList = new LinkedList<>();

    public static void monitor() {
        final long start = System.currentTimeMillis();

        Thread monitorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(RED_S + "[-------------------------:Monitor Thread Start:," + start + RED_E);

                do {
                    try {
                        //正确，并且推荐的方法
                        Iterator<Thread> iterator = threadArrayList.iterator();
                        while (iterator.hasNext()) {
                            Thread thread = iterator.next();
                            System.out.println(RED_S + "-------------------------:[" + thread.getId() + "] [" + thread.getName() + "] [" + thread.getState().name() + "]:" + RED_E);
                            if ("TERMINATED".equals(thread.getState().name())) {
                                iterator.remove();
                                System.out.println(RED_S + "-------------------------:REMOVE:[" + thread.getId() + "] [" + thread.getName() + "] [" + thread.getState().name() + "]:" + RED_E);
                            }
                        }
                        Thread.sleep(1000 * 5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } while (threadArrayList.size() > 0);

                long end = (System.currentTimeMillis() - start);
                System.out.println(RED_S + "-------------------------:Monitor Thread ShutDown:" + end + RED_E);
            }
        });
        monitorThread.setName("Monitor");
        monitorThread.start();
        threadArrayList.add(monitorThread);
    }

    public static void main(String[] args) {
        monitor();
        System.out.println(RED_S + "-------------------------:Monitor Thread ShutDown:" + RED_E);
//        System.out.println("Hello,Akina!");
        System.out.println("\033[30;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[31;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[32;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[33;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[34;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[35;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[36;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[37;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[40;31;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[41;32;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[42;33;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[43;34;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[44;35;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[45;36;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[46;37;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[47;4m" + "Hello,Akina!" + "\033[0m");
    }
}
