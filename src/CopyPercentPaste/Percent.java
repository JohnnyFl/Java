package CopyPercentPaste;

public class Percent implements Runnable {

    private Action action = new Action();
    private int length;

    public Percent() {
    }

    public Percent(Action action) {
        this.action = action;
    }

    public int see() {
        for (; !action.isStop(); ) {
            this.length = action.getLen();
        }
        return length;
    }

    @Override
    public void run() {
        see();
        int a, b;
        b = 0;
        for (int i = 0; i <= length; i++) {
//            System.out.println(((i * 100) / length) + " %");
            a = ((i * 100) / see());

            if(a > b){
                System.out.println(a + " %");
                b = a;
            }
        }
    }
}
