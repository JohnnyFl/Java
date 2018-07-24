package Functional_programming;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try {
            printStatistics(file);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void printStatistics(File file) throws IOException {
        Files.lines(Paths.get(file.getAbsolutePath()))
                .map(n -> n.toUpperCase())
                .flatMapToInt(n -> n.chars())
                .filter(n -> n>='A' && n<='Z')
                .mapToObj((n) -> (Character.valueOf((char) n)))
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream()
                .sorted((a,b) -> (int) (b.getValue() - a.getValue()))
                .forEach(n -> System.out.println(n));
    }
}
