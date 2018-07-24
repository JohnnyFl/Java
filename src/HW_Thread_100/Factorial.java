package HW_Thread_100;

import java.math.BigInteger;

public class Factorial implements Runnable {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public long calculateFactorial(long number) {
        long fact = 1;
        for (int i = 2; i <= number; i += 1) {
            fact = fact * i;
        }
        return fact;
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        System.out.println(th.getName() + " "  + calculateFactorial(number));
    }
}
