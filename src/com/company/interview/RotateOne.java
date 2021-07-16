package com.company.interview;

public class RotateOne {
    /**Left rotation of an Array by order of 1*/
    /**Given an array and an integer k, rotate the array by k spaces. Do this without generating a new array and without using extra space.*/
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9 };
        int n = arr.length;
        int k = 2;
        int mod = k % n;
        for (int i = 0; i < n; i++)
            System.out.print(arr[(i + mod) % n] + " ");
    }
}