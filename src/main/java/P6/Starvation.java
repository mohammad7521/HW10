package P6;


//write a java program that demonstrates starvation.
public class Starvation  extends Thread {

    @Override
    public void run() {
        System.out.println(currentThread().getName() + " started");
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("thread"+currentThread().getName()+" has stopped");
    }
}
