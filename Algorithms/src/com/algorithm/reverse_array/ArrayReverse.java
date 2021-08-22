package com.algorithm.reverse_array;

import java.util.stream.IntStream;

public class ArrayReverse {
    public static int[] reverseWithFor(int[] array) {
        for(int i=0; i<array.length/2; i++) {
            int temp=array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i -1] = temp;
        }
        return array;
    }

    public static int[] reverseWithArray(int[] array) {
        int[] result=new int[array.length];
        for(int i = array.length - 1, j=0; i>=0; i--, j++) {
            result[j]=array[i];
        }
        return result;
    }

//    Object[] invertUsingStreams(Object[] array) {
//        return IntStream.rangeClosed(1, array.length)
//                .mapToObj(i -> array[array.length - i])
//                .toArray();
//    }

    public static int[] reverseWithStream(int[] array) {
        return IntStream.rangeClosed(1, array.length)
                .map(i -> array[array.length - i])
                .toArray();
    }
}
