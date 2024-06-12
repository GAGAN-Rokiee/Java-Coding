package Threads;

public class ThreadDemo {

    static int x = 0;
    public static void main(String args[]) throws Exception{
        Runnable r = ()-> {
            for(int j =0;j<10000;j++) x++;
        };

        Thread t1 = new Thread(r);
        t1.start();
        Thread t2 = new Thread(r);
        t2.start();
        Thread t3 = new Thread(r);
        t3.start();
        Thread.sleep(10000);
        System.out.println(x);
    }
}
