package com.algorithm.reverse_string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringReverse {
    public static void ReverseWithStringBuilder(String sourceStr) {
        StringBuilder resultStr = new StringBuilder();
        resultStr.append(sourceStr).reverse();
        System.out.println(resultStr);
    }

    public static void ReverseWithArray(String sourceStr) {
        char[] symbols = sourceStr.toCharArray();
        char[] resultSymbols = new char[symbols.length];
        for(int i = symbols.length-1; i>=0; i--) {
            resultSymbols[resultSymbols.length-i -1]=symbols[i];
        }
        String resultStr = new String(resultSymbols);
        System.out.println(resultStr);
    }
}
