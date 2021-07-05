package com.company.intarray;

public class PairSum {
    /**Write a program that, given an array A[] of n numbers and another number x,
     * determines whether or not there exist two elements in S whose sum is exactly x.**/
    public static void main(String[] args) {
        int arr[] = { 1, 4, 45, 6, 10, 8};
        int k = 16;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==k)
                    System.out.println(arr[i] +" "+arr[j]);
            }
        }
    }
}
