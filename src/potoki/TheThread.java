package potoki;

public class TheThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+ "from thread "+ Thread.currentThread());
        }
    }
}
