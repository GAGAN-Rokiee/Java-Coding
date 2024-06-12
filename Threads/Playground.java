package Threads;

import javax.management.ListenerNotFoundException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Playground {

    public static void main(String[] args) {

        Runnable myRunnable = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task is running: " + i);
                try {
                    Thread.sleep(1000); // Simulating some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread myThread = new Thread(myRunnable);

        // Start the thread
        myThread.start();

        System.out.println("Main thread continues while the new thread is running.");

    }

}


