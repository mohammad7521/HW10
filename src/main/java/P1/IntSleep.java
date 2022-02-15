package P1;

public class IntSleep extends Thread{

    @Override
    public void run() {
        System.out.println("hello");
        try {
            IntSleep.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
