package CopyPercentPaste;

public class Action {

    private int len = -1;
    private boolean turn = false;
    private boolean turn1 = false;
    private boolean stop = false;
    private byte[] arr;

    public synchronized byte[] getArr() {
        for (; turn1 == false;){
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        turn1 = false;
        notifyAll();
        return arr;
    }

    public synchronized void setArr(byte[] arr) {
        for(; turn1 == true;){
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        this.arr = arr;
        turn1 = true;
        notifyAll();
    }

    public Action() {
    }

    public synchronized int getLen(){
        for (; turn == false;){
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        int temp = this.len;
        turn = false;
        notifyAll();
//        System.out.println("Bytes accepted -> " + this.len);
        return temp;
    }

    public synchronized void setLen(int length){
        for(; turn == true;){
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.len = length;
        turn = true;
//        System.out.println("Send bytes -> " + this.len);
        notifyAll();
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
