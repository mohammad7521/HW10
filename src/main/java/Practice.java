public class Practice {

    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("hello from thread");
            }
        };

        Thread t1=new Thread(r);


        ThreadPractice t2=new ThreadPractice();
        t2.setPriority(1);
        t1.start();
        System.out.println(t1.isAlive());
        t2.start();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.setName("thread 1");
        t2.setName("thread 2");
        System.out.println(t1.getId());
        System.out.println(t2.getId());
        System.out.println(t1.getName());
        System.out.println(t2.getName());


        //alive or dead
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

        //runnable state
        System.out.println(t1.getState());
        System.out.println(t2.getState());

        //priority
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);

        //daemon state
        System.out.println(t1.isDaemon());




    }

}
