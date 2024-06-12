package Threads;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            // Asynchronous task
            return "Hello";
        }).thenApplyAsync(result -> {
            // Process the result asynchronously
            return result + " World";
        }).thenAcceptAsync(finalResult -> {
            // Print the final result asynchronously
            System.out.println(finalResult);
        });
    }
}

