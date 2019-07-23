package potoki;

public class TheRunnable implements Runnable {

    public void test(){
        synchronized (this) {
            System.out.println("sync call");
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            test();
            System.out.println(i+ "from thread "+ Thread.currentThread());
        }
    }
}
