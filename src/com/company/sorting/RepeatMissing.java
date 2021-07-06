package com.company.sorting;
import java.util.Arrays;

public class RepeatMissing {
    /**Find repeating and missing element in an array.**/
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4};
        int n = arr.length;
        int sum = n * (n + 1) / 2;
        int sum_arr = 0;
        int repeating = -1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                repeating = arr[i];
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            sum_arr += arr[i];
        }
        int missing = sum + repeating - sum_arr;
        System.out.println("repeating: " + repeating + ", missing: " + missing);
    }
}