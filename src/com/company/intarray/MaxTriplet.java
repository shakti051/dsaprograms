package com.company.intarray;
import java.util.Arrays;

/**Given a list of integers, return the largest product that can be made by multiplying any three integers.**/
public class MaxTriplet {
    public static void main(String[] args) {
        int arr[]= {-10, -10, 5, 2};
        int n = arr.length;
        Arrays.sort(arr);
        int max = Math.max(arr[0]*arr[1]*arr[n-1],arr[n-1]*arr[n-2]*arr[n-3]);
        System.out.println("The max sum is: "+max);
    }
}
