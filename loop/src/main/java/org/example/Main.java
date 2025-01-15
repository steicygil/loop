package org.example;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            int sqr = i*i;
            int cube = sqr*i;
            System.out.println(i+" "+sqr+" "+cube);
        }
    }
}