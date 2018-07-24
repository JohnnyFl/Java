package HashMap_HW;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;

public class WriteFile implements Serializable {
    private static final long serialVersionUID = 1L;
    private HM hm = new HM();
    private ArrayList al = new ArrayList();


    public HM getHm() {
        return hm;
    }

    public void setHm(HM hm) {
        this.hm = hm;
    }

    public ArrayList getAl() {
        return al;
    }

    public void setAl(ArrayList al) {
        this.al = al;
    }

    public void writeFile(){
        try(PrintWriter pw = new PrintWriter("Ukrainian.out")){
            for (int i = 0; i < al.size(); i++) {
                pw.print(al.get(i) + " ");
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
