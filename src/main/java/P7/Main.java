package P7;

import java.io.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\MMD\\Desktop\\Sample.txt");
        Scanner scanner = new Scanner(file);
        DataAdder dataAdder=new DataAdder();

//        while(scanner.hasNextLine()){
//            if (dataAdder.addData(scanner.nextLine())){
//                System.out.println("data added successfully");
//            }
//        }


        Runnable r= () -> {
            while(scanner.hasNextLine()){
                dataAdder.addData(scanner.nextLine());
            }
        };

        ExecutorService executorService=Executors.newFixedThreadPool(5);
        executorService.execute(r);
        executorService.shutdown();

    }
}
