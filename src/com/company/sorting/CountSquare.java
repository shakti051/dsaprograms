package com.company.sorting;

public class CountSquare {
    public static void main(String[] args) {
        int n=9;
        int count = 0;
        for (int i=1;i<n;i++){
            if (i*i<n)
                count++;
        }
        System.out.println(count);
    }
}
