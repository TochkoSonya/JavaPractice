package com.algorithm;

import com.algorithm.fibonacci.Fibonacci;
import com.algorithm.prime_check.PrimeCheck;
import com.algorithm.reverse_array.ArrayReverse;
import com.algorithm.reverse_string.StringReverse;
import com.algorithm.sort.bubble_sort.BubbleSort;
import com.algorithm.sort.selection_sort.SelectionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //fibonacci
//        int n = 25;
//        Fibonacci fibonacci = new Fibonacci();
//        fibonacci.timeWithFor(n);
//        fibonacci.timeWithRecursive(n);
//
//        //array invert
//        Object[] array1 = {1, 2, 3, 4, 5, 6};
//        Object[] array2 = {1, 2, 3, 4, 5};
//        String[] array3 = {"q", "w", "e"};
//
//        Object[] result1 = ArrayReverse.reverseWithFor(array1);
//        System.out.println(Arrays.toString(result1));
//
//        Object[] result2 = ArrayReverse.reverseWithArray(array2);
//        System.out.println(Arrays.toString(result2));
//
//        Object[] result3 = ArrayReverse.reverseWithStream(array3);
//        System.out.println(Arrays.toString(result3));
//
//        //bubble sort
//        int[] array1 = {10, 5, 88, 66, 111, 0, 34, 29};
//        //BubbleSort.sort(array1);
//        System.out.println(Arrays.toString(array1));
//
//        SelectionSort.sort(array1);
//        System.out.println(Arrays.toString(array1));

        //string reverse
        StringReverse.ReverseWithStringBuilder("Hello_World");
        StringReverse.ReverseWithArray("Hello_world");

        PrimeCheck.IsPrimeNumber(71);

    }
}
