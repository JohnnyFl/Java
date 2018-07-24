package CopyPercentPaste;

import java.io.FileInputStream;
import java.io.IOException;

public class Copy implements Runnable {

    private Action action = new Action();

    private byte[] a;

    private String str = "C:\\Users\\James\\Downloads\\VONGLOE - Find You ft. BELLS.mp3";

    public Copy() {
    }

    public Copy(Action action) {
        this.action = action;
    }

    public void readF (){
            try {

                FileInputStream in;
                in = new FileInputStream(str);
                int av = in.available();
                byte[] b = new byte[av];
                in.read(b);

                this.a = b;
            } catch (IOException e){
                e.printStackTrace();
            }
    }

    @Override
    public void run() {
        readF();
        action.setArr(a);
        action.setLen(a.length);
        action.setStop(true);
    }
}
