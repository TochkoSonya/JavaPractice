package com.algorithm.fibonacci;

import java.time.Duration;
import java.time.LocalTime;

public class Fibonacci {

    public void timeWithFor(int n) {
        LocalTime time1 = LocalTime.now();
        calculateWithFor(n);
        LocalTime time2 = LocalTime.now();
        long duration = Duration.between(time1,time2).toNanos();
        System.out.println("Elapsed time (loop) = " + duration);
    }

    public void timeWithRecursive(int n) {
        LocalTime time1 = LocalTime.now();
        calculateWithRecursive(n);
        LocalTime time2 = LocalTime.now();
        long duration = Duration.between(time1,time2).toNanos();
        System.out.println("Elapsed time (recursive) = " + duration);
    }

    private long calculateWithFor(int n) {
        long first = 0;
        long second = 1;
        long result = n;
        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    private long calculateWithRecursive(int n) {
        if(n<=1) {
            return n;
        }
        return calculateWithRecursive(n-2) + calculateWithRecursive(n-1);
    }
}
