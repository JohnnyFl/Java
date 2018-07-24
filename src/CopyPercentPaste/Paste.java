package CopyPercentPaste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Paste implements Runnable {
    Action action = new Action();
    File out = new File("C:\\Users\\James\\Desktop\\copy\\VONGLOE - Find You ft. BELLS.mp3");
//

    public Paste() {
    }

    public Paste(Action action) {
        this.action = action;
    }

    public void Paste() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            byte[] b = action.getArr();
            fos.write(b);
            System.out.println("File copied successfully!");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
//        finally {
//            try {
//                fos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Paste();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
