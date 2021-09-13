package com.algorithm;

import com.algorithm.fibonacci.Fibonacci;
import com.algorithm.prime_check.PrimeCheck;
import com.algorithm.reverse_array.ArrayReverse;
import com.algorithm.reverse_list.Node;
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
//
//        //string reverse
//        StringReverse.ReverseWithStringBuilder("Hello_World");
//        StringReverse.ReverseWithArray("Hello_world");
//
//        PrimeCheck.IsPrimeNumber(71);


        Node node1= new Node();
        Node node2=new Node();
        Node node3= new Node();
        Node node4=new Node();

        node1.data=1;
        node2.data=2;
        node3.data=3;
        node4.data=4;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        Node newNode=Node.reverse(node1);
        System.out.println(newNode.data);
        System.out.println(newNode.next.data);
    }
}
