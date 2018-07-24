package CheckWebsiteFromFile;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;

public class Check {
    private ReadFile rf = new ReadFile();
    private HashMap hp = rf.readFile();
    Set<HashMap.Entry<String, String>> hm2 = hp.entrySet();

    public void check(){
        for (HashMap.Entry<String, String> st: hm2) {
            try{
                URL url = new URL(st.getKey());
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                if(con.getResponseCode() >= 200 && con.getResponseCode() < 300){
                    System.out.println(st.getValue() + " - website is available!");
                } else {
                    System.out.print(st.getValue() + " - website is unavailable! ");
                    System.out.println(con.getResponseMessage() + " " + con.getResponseCode());
                }
            } catch (IOException e){
                System.out.println("The website is not registered!");
            }
        }
    }
}
