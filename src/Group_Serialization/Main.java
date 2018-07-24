package Group_Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Faculty IT = new Faculty();
        IT.addGroup("Wolfs", 15,'A');
        IT.addGroup("Lions", 19,'B');
        IT.addGroup("Dragons", 17, 'C');

        System.out.println();
        System.out.println("Show message");
        System.out.println();
        IT.printFaculty();

        try(ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("fel"))){
            OOS.writeObject(IT);
        } catch (IOException e){
            System.out.println("Error save faculty");
        }
        Faculty Psycology = null;
        try(ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("fel"))){
            Psycology=(Faculty)OIS.readObject();
        } catch (IOException | ClassNotFoundException e){
            System.out.println("Error read Faculty");
        }
        System.out.println();
        System.out.println("Show message");
        System.out.println();
        Psycology.printFaculty();
    }
}
