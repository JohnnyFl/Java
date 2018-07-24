package CopyPercentPaste;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Action action = new Action();
        Copy cp = new Copy(action);
        Percent pc = new Percent(action);
        Paste pt = new Paste(action);

        Thread th1 = new Thread(cp);
        Thread th2 = new Thread(pc);
        Thread th3 = new Thread(pt);

        th1.start();
        th2.start();
        th3.start();
//        th1.join();
//        th2.join();
//        th3.join();
    }
}
