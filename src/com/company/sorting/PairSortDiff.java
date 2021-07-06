package com.company.sorting;
import java.util.Arrays;

public class PairSortDiff {
    /**Find a pair with given difference.**/
    public static void main(String[] args) {
        int arr[] = {5, 20, 3, 2, 5, 80};
        int diff = 78;
        int i = 0, j = 1;
        Arrays.sort(arr);
        while (i < arr.length && j < arr.length) {
            if (arr[j] - arr[i] == diff) {
                System.out.println(arr[i] + " " + arr[j]);
                return;
            } else if (arr[j] - arr[i] < diff)
                j++;
            else i++;
        }
    }
}