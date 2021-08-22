package com.algorithm.reverse_array;

import java.util.stream.IntStream;

public class ArrayReverse {
    public static Object[] reverseWithFor(Object[] array) {
        for(int i=0; i<array.length/2; i++) {
            Object temp=array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i -1] = temp;
        }
        return array;
    }

    public static Object[] reverseWithArray(Object[] array) {
        Object[] result=new Object[array.length];
        for(int i = array.length - 1, j=0; i>=0; i--, j++) {
            result[j]=array[i];
        }
        return result;
    }

    public static Object[] reverseWithStream(Object[] array) {
        return IntStream.rangeClosed(1, array.length)
                .mapToObj(i -> array[array.length - i])
                .toArray();
    }
}
