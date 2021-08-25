package com.algorithm.sort.selection_sort;

public class SelectionSort {
    public static void sort(int[] array) {
        for (int i=0 ; i<array.length; i++) {
            int position = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    position = j;
                    min = array[j];
                }
            }
            array[position] = array[i];
            array[i] = min;
        }
    }
}
