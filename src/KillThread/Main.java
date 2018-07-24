package KillThread;

public class Main {
    public static void main(String[] args){
        Thread thr = new Thread(new KillerThread());
        thr.start();
    }
}
