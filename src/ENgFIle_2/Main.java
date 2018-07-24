package ENgFIle_2;

public class Main {

    public static void main(String[] args) {

        ReadFromFile rff = new ReadFromFile();
        String fileName = "C:\\Users\\James\\Desktop\\java\\new_doc.txt";
        System.out.println("Statistic of using letters:");
        rff.sort(fileName);
    }
}
