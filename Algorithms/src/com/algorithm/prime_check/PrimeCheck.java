package com.algorithm.prime_check;

public class PrimeCheck {
    public static void IsPrimeNumber(int value) {
        int temp;
        boolean isPrime=true;
        for(int i=2; i<value/2; i++) {
            temp=value%i;
            if(temp==0) {
                isPrime=false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(value + " - простое число");
        }
        else {
            System.out.println(value + " - составное число");
        }
    }
}
