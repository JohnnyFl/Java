package Input_Output;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String [] args){
        File in = new File("C:\\Users\\James\\Desktop\\bitcoin.pdf");
        File out = new File("bool.pdf");

        try {
            FileOperation.fileCopy(in,out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        File folder = new File("C:\\Users\\James\\Desktop\\portfolio");
        System.out.println(FileOperation.calculateFolderSize(folder));
    }

}
