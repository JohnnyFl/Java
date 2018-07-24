package HashMap_HW;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class HM implements Serializable {

    private static final long serialVersionUID = 1L;
    private HashMap hm = new HashMap();
    private ReadFile rw = new ReadFile();
    private ArrayList tal = new ArrayList();
    private String str = "";

    public HashMap getHm() {
        return hm;
    }

    public void setHm(HashMap hm) {
        this.hm = hm;
    }

    public ReadFile getRw() {
        return rw;
    }

    public void setRw(ReadFile rw) {
        this.rw = rw;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setTal(ArrayList tal) {
        this.tal = tal;
    }

    public String getStr() {
        return str;

    }

    public HM(String str) {
        this.str = str;
    }

    public HM() {
    }

    public ArrayList getTal() {
        return tal;
    }

    public void addWord(String key, String value){
        hm.put(key, value);
    }

    public void addWords(){
        hm.put("It's", "Це");
        hm.put("so", "так");
        hm.put("cold", "холодно");
        hm.put("outside", "назовні");
        hm.put("I'm", "Я");
        hm.put("alone,", "один");
        hm.put("alright", "впорядку");
    }

    public void getWord(){
        System.out.println(hm.get(str));
    }

    public ArrayList translate(){
        String[] arr = rw.read(str);
        for (String c: arr
             ) {
            tal.add(hm.get(c));
//            System.out.print(hm.get(c) + " ");
        }
        return tal;
    }

}
