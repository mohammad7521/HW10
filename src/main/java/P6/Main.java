package P6;

public class Main {


    public static void main(String[] args) {


        Starvation starvation1=new Starvation();
        Starvation starvation2=new Starvation();
        Starvation starvation3=new Starvation();
        Starvation starvation4=new Starvation();
        Starvation starvation5=new Starvation();
        Starvation starvation6=new Starvation();
        Starvation starvation7=new Starvation();
        Starvation starvation8=new Starvation();

        starvation1.setPriority(10);
        starvation2.setPriority(8);
        starvation3.setPriority(6);
        starvation4.setPriority(4);
        starvation5.setPriority(3);
        starvation6.setPriority(2);
        starvation7.setPriority(1);
        starvation8.setPriority(1);

        starvation1.start();
        starvation2.start();
        starvation3.start();
        starvation4.start();
        starvation5.start();
        starvation6.start();
        starvation7.start();

    }
}
