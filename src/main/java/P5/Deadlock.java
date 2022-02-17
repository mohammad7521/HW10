package P5;


//write a program that creates a deadlock.

//deadlock is a situation where thread 1 is trying to access a section which the key to that
//section is held by thread 2 and thread 2 is trying to access a section which it's key is held by
//thread 1

public class Deadlock {

    //keys
    private static Object o1=new Object();
    private static Object o2=new Object();

    //deadlock methods:

    //deadlock method1
    public static void method1(){

        synchronized (o1){
            synchronized (o2){
                System.out.println("method 1 is running!");
            }
        }
    }


    //deadlock method2
    public static void method2(){
        synchronized (o2){
            synchronized (o1){
            System.out.println("method 2 is running!");
            }
        }
    }
}
