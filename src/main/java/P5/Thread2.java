package P5;

public class Thread2 extends Thread{

    @Override
    public void run() {
        while (true) {
            Deadlock.method2();
            try {
                sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
