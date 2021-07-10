package com.company.sorting;
import java.util.Arrays;

public class MergeSortedExtra {
    /**Merge two sorted array with o(1) extra space.*/
    public static void main(String[] args) {
         int arr1[] = new int[] { 1, 5, 9, 10, 15, 20 };
         int arr2[] = new int[] { 2, 3, 8, 13 };
        int  n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0, k = n - 1;
        while (i <= k && j < m) {
            if (arr1[i] < arr2[j])
                i++;
            else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (i=0;i< arr1.length;i++)
            System.out.print(arr1[i]+" ");
        for (i=0;i< arr2.length;i++)
            System.out.print(arr2[i]+" ");
    }
}
