package HashMap_HW;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "English.in";
        ReadFile rw = new ReadFile(str);
        WriteFile wf = new WriteFile();
        HM hm = new HM(str);

        hm.addWords();

        wf.setAl(hm.translate());
        wf.writeFile();

        try(ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("newFile"))){
            OOS.writeObject(hm);
        } catch (IOException e){
            e.printStackTrace();
        }


//        System.out.println(Arrays.toString(rw.read(str)));


    }
}
