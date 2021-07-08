package com.company.interview;

public class SubSList {
    /**  Create a class that initializes with a list of numbers and has one method called sum. sum should take in two parameters,
     * start_idx and end_idx and return the sum of the list from start_idx (inclusive) to end_idx` (exclusive).**/
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7};
        int start_idx = 2;
        int end_idx = 5;
        int sum= 0;
        for (int i =start_idx;i<end_idx;i++){
            sum += arr[i];
        }
        System.out.println(sum);//3+4+5 = 12
    }
}