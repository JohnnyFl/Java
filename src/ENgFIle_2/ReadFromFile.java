package ENgFIle_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromFile {
    private  ArrayList<Integer> arr = new ArrayList<>();

    public  int readFromFile(String fileName) {
        int count = 0;
        int countAll = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String temp = "";
            for (; (temp = br.readLine()) != null;) {
                for (char c = 'a'; c <= 'z'; c++) {
                    count = countLetter(temp, c);
                    if ((arr.size() == 0) || (arr.size() - 1) < (c - 'a')) {
                        arr.add(count);
                        countAll = countAll + count;

                    } else {
                        if (count > 0) {
                            int index = c - 'a';
                            int znach = arr.get(index) + count;
                            countAll = countAll + count;
                            arr.set(index, znach);
                        }
                    }
                }

            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        return countAll;
    }

    static int countLetter(String text, char letter) {
        int count = 0;
        for (char let : text.toCharArray()) {
            if (String.valueOf(letter).equalsIgnoreCase(String.valueOf(let))) {
                ++count;
            }
        }
        return count;
    }

    void sort(String fileName) {
        String aChar;
        int maxP;
        int countAll = readFromFile(fileName);
        System.out.println("Count of letters in this file:" + countAll);
        for (int i = 0; i < arr.size(); i++) {
            maxP = max(arr);
            aChar = new Character((char) (maxP + 'a')).toString();
            System.out.print(aChar + " - " + String.format("%.2f", (double) arr.get(maxP) / countAll*100));
            System.out.println("%");
            arr.set(maxP, -1);
        }

    }

    static int max(ArrayList<Integer> arr) {
        int maxEl = arr.get(0);
        int maxP = 0;
        for (int i = 0; i < arr.size(); i++) {
            if ((arr.get(i) > maxEl) && (arr.get(i) != -1)) {
                maxEl = arr.get(i);
                maxP = i;
            }
        }
        return maxP;
    }
}
