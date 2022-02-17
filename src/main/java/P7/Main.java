package P7;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        File file=new File("F:\\Notes.txt");


        try {
            Scanner scanner=new Scanner(file);

            while(scanner.hasNextLine()) {
                Runnable addData = new Runnable() {
                    @Override
                    public void run() {
                        DataAdder d = new DataAdder(scanner.nextLine());
                    }
                };
                executorService.execute(addData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    };

}
