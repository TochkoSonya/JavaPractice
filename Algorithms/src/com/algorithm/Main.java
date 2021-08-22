package com.algorithm;

import com.algorithm.fibonacci.Fibonacci;
import com.algorithm.reverse_array.ArrayReverse;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //fibonacci
        int n=25;
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.timeWithFor(n);
        fibonacci.timeWithRecursive(n);

        //array invert
        Object[] array1= {1,2,3,4,5,6};
        Object[] array2= {1,2,3,4,5};
        String[] array3= {"q","w","e"};

        Object[] result1 = ArrayReverse.reverseWithFor(array1);
        System.out.println(Arrays.toString(result1));

        Object[] result2 = ArrayReverse.reverseWithArray(array2);
        System.out.println(Arrays.toString(result2));

        Object[] result3 = ArrayReverse.reverseWithStream(array3);
        System.out.println(Arrays.toString(result3));



    }
}
