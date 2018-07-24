package Generics_Lesson;

import Threads.Inter;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SomeClass<Integer> someC = new SomeClass<>(1234);

        someC.setObj(45);

        System.out.println(someC);

//        SomeClass<String> someCTwo = new SomeClass<>("Hello world!");

//        someCTwo.setObj("Good bye, World");

//        System.out.println(someCTwo);

//        SomeClass someCThree = new SomeClass(new File("a.txt"));

        SomeClass<BigInteger> someCFour = new SomeClass<>(new BigInteger("12345"));
        System.out.println(someCFour);

        Integer[] arrayOne = new Integer[]{4,2,4,7,9};

        int min = findMin(arrayOne);

        System.out.println(min);

        String [] arrayTwo = new String[]{"Hello", "World", "A", "B"};

        String minString = findMin(arrayTwo);

        System.out.println(minString);

//        Scanner[] scArray = new Scanner[]{new Scanner(System.in), new Scanner(System.in)};
//
//        findMin(scArray);
    }

    public static <T extends Comparable<T>> T findMin(T[] array){
        T min = array[0];
        for (T element: array
             ) {
            if(min.compareTo(element)>0){
                min = element;
            }
        }
        return min;
    }
}
