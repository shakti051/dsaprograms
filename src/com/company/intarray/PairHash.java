package com.company.intarray;

import java.util.HashSet;
import java.util.Set;

public class PairHash {
    /**Write a program that, given an array A[] of n numbers and another number x,
     * determines whether or not there exist two elements in S whose sum is exactly x.**/
    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8, 8};
        int sum = 16;
        Set<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];
            if (s.contains(temp)) {
                System.out.println(arr[i] + ", " + temp);
            } else {
                s.add(arr[i]);
            }
        }
    }
}
