package HashMap_HW;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

public class ReadFile implements Serializable {
    private static final long serialVersionUID = 1L;
    private String fileIn;

    public ReadFile() {

    }


    public ReadFile(String fileIn) {
        this.fileIn = fileIn;
    }

    public String getFileIn() {
        return fileIn;
    }

    public void setFileIn(String fileIn) {
        this.fileIn = fileIn;
    }

    public String[] read(String fileIn) {
        String[] text = new String[0];
        try {
            String str = null;
            BufferedReader br = new BufferedReader(new FileReader(fileIn));
            while ((str = br.readLine()) != null) {
                String[] newWords = str.split(" ");
                String[] result = new String[text.length + newWords.length];
                System.arraycopy(text, 0, result, 0, text.length);
                System.arraycopy(newWords, 0, result, text.length, newWords.length);
                text = result;
            }
            br.close();
        } catch (IOException e) {
            System.out.println("IO error! " + e);
        }
        return text;
    }
}
