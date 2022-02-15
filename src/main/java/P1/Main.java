package P1;

public class Main {

    public static void main(String[] args) {
        IntSleep intSleep=new IntSleep();

        long startTime=System.currentTimeMillis();

        while(System.currentTimeMillis()<startTime+2000) {
            intSleep.run();
        }

    }
}
