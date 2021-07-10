package com.company.sorting;
import java.util.Arrays;

public class LessTriplet {
    /**Find Triplets with sum smaller than Target Sum*/
     public static void main(String[] args) {
         int arr[] = { 1, 2, -3, 4, -2};
         int targetSum =1;
         Arrays.sort(arr);
         int tripletCount = 0;
         for(int i = 0; i < arr.length - 2; i++) {
             int start = i + 1;
             int end = arr.length - 1;
             while(start < end) {
                 int sum = arr[i] + arr[start] + arr[end];
                 if(sum < targetSum) {
                     tripletCount += end - start;
                     start++;
                 } else {
                     end--;
                 }
             }
         }
         System.out.println(tripletCount);
    }
}
