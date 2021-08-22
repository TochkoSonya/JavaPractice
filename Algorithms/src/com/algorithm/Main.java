package com.algorithm;

import com.algorithm.fibonacci.Fibonacci;
import com.algorithm.reverse_array.ArrayReverse;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int n=25;
//        Fibonacci fibonacci = new Fibonacci();
//        fibonacci.timeWithFor(n);
//        fibonacci.timeWithRecursive(n);

        //array invert
        int[] array1= {1,2,3,4,5,6};
        int[] array2= {1,2,3,4,5};
        int[] array3= {1,2,3,4,5,6,7};

        int[] result1 = ArrayReverse.reverseWithFor(array1);
        System.out.println(Arrays.toString(result1));

        int[] result2 = ArrayReverse.reverseWithArray(array2);
        System.out.println(Arrays.toString(result2));

        int[] result3 = ArrayReverse.reverseWithStream(array3);
        System.out.println(Arrays.toString(result3));



    }
}
