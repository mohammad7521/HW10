package P2;



//identify the problems with the following checking account class
public class CheckingAccount {
    private int balance;



    public CheckingAccount(int initialBalance) {

        balance = initialBalance;
    }


    //this method does a read,modify,write operation.
    //therefore, it should contain the synchronised keyword
    //in order to overcome race condition problems.

    public synchronized boolean withdraw(int amount) {
        if (amount <= balance) {
            try {
                Thread.sleep((int) (Math.random() * 200));
            } catch (InterruptedException ie) {
            }

            //read modify write.
            balance -= amount;
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        final CheckingAccount ca = new CheckingAccount(100);
        Runnable r = new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                for (int i = 0; i < 10; i++)
                    System.out.println(name + " withdraws $10: " +
                            ca.withdraw(10));
            }
        };
        Thread thdHusband = new Thread(r);
        thdHusband.setName("Husband");
        Thread thdWife = new Thread(r);
        thdWife.setName("Wife");
        thdHusband.start();
        thdWife.start();
    }
}