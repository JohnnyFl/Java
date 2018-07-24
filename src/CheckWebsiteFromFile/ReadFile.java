package CheckWebsiteFromFile;

import java.io.*;
import java.util.HashMap;

public class ReadFile {
    private File file = new File("Websites.txt");

    public HashMap<String , String> readFile() {
        HashMap<String , String> hm = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String st = "";

            for (;(st = br.readLine())!=null;){
                hm.put(st,st);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hm;
    }
}
