package P5;

public class Main {

    public static void main(String[] args) {

        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();

        t1.start();
        t2.start();

        //after few attempts of the while loop one of the threads
        //will enter a deadlock because one of the locks needed for the method
        //to run is acquired by another thread which is calling the other method
        //therefore the application will enter a deadlock!.
    }
}
