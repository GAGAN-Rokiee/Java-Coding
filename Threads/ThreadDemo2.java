package Threads;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable runnable =()->
        {

            try {
                Thread.sleep(5000);
                System.out.println("Print value after 5 sec");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };


        Thread t1= new Thread(runnable);
        t1.start();

    }
}
