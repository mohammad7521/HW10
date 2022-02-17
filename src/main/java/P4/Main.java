package P4;


import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//write a java program which calculates the file size of a directory
public class Main {

    public static void calculate(File folder, int threads) {


        ExecutorService pool = Executors.newFixedThreadPool(threads);
        for (File f : folder.listFiles()) {
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    if (f.isDirectory()) {
                        calculate(f, threads);
                    } else {
                        FileSizeCalculator fileSizeCalculator = new FileSizeCalculator(f);
                        fileSizeCalculator.start();

                        try {
                            fileSizeCalculator.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };
            pool.execute(r);
        }
    }

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("enter folder path:");
                String path = scanner.nextLine();

                System.out.println("enter number of threads:");
                int threads = scanner.nextInt();
                File folder = new File(path);
                calculate(folder, threads);
            } catch (InputMismatchException e) {
                System.out.println("please enter a valid number!");
            } catch (NullPointerException e) {
                System.out.println("please enter a correct directory!");
            }
        }
    }
}
