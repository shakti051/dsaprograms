package com.company.sorting;

import java.util.Arrays;

public class PairDiff {
    /**
     * Find a pair with given difference.
     **/
    public static void main(String[] args) {
        int arr[] = {5, 20, 3, 2, 5, 80};
        int diff = 78;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == diff) {
                    System.out.println(arr[i] + "  " + arr[j]);
                    return;
                }
            }
        }

    }
}
