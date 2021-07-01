package com.company.interview;

public class MissingElement {
    public static void main(String[] args) {
       int  arr[] = {1, 2, 4, 6, 3, 7, 8,10,9};
       int n = 10;
       int sum = 0;
       int totalSum = n*(n+1)/2;
       for (int i=0;i<arr.length;i++)
            sum += arr[i];
        int missing =  totalSum -sum;
        System.out.println("The missing element is: "+missing);
    }
}