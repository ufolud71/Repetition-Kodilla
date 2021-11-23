package com.repetition.kodillacourse;

public class Euklides {

    public void startAlgorithm(int a, int b) {

        int first = a;
        int second = b;

        while(a != b) {
            if (a > b) {
                a = a - b;
            } else {
               b = b - a;
            }
        }
        System.out.println("The biggest common divisor of [" + first + "] and [" + second + "] equals: " + a);
    }
}
