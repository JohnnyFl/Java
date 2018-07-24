package HW_Thread_100;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread[] a = new Thread[100];

        for (int i = 0; i < a.length; i++) {
            a[i] = new Thread(new Factorial(i));
        }
        for (int i = 0; i < a.length; i++) {
            a[i].start();
        }
        for (int i = 0; i < a.length; i++) {
            a[i].join();
        }
    }
}
