package potoki;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(10);
        ex.submit(()-> System.out.println(""));
        ex.shutdown();
    }
//        TheThread thread = new TheThread();
//        TheRunnable runnableThread = new TheRunnable();
//        Thread t  = new Thread(runnableThread);
//        t.start();
//        t.join();
//        TheRunnable runnableThread2 = new TheRunnable();
//        Thread t2  = new Thread(runnableThread2);
//        t2.start();
//        t2.wait();
//
//        for (int i = 0; i < 10; i++) {
//            if(i==6){
//                Thread.currentThread()
//            }
//            try {
//                Thread.sleep(800);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(i+ " from thread "+ Thread.currentThread());
//        }
//    }
}
