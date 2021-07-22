package com.collection;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
            System.out.println("Tuna is yummy");
            System.out.println("Salmon is yummy too");
            Thread.sleep(2000);
        }
    }
}
