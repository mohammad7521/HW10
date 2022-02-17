package P5;

public class Thread1 extends Thread{

    @Override
    public void run() {

        while (true) {
            Deadlock.method1();
            try {
                sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
