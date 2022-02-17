package P4;

import java.io.File;

public class FileSizeCalculator extends Thread{

    private File file;

    @Override
    public void run() {
        calculate();
    }


    public void calculate() {

        long fileSize=file.length();

        if (fileSize<1024){
            System.out.println(file.getName()+" "+fileSize+"bytes");
        }

        else if (fileSize>1024 && fileSize<1048576){
            System.out.println(file.getName()+" "+fileSize/1024+"KB");
        }
        else if(fileSize>1048579 && fileSize<1073741824){
            System.out.println(file.getName()+" "+fileSize/1048579+"MB");
        }
        else if (fileSize>1073741824 && fileSize<1099511627776L){
            System.out.println(file.getName()+" "+fileSize/1073741824+"GB");
        }
        else if (fileSize>1099511627776L && fileSize<112589906842624L){
            System.out.println(file.getName()+" "+fileSize/1099511627776L+"TB");
        }
    }

    public FileSizeCalculator(File file) {
        this.file=file;
    }
}
