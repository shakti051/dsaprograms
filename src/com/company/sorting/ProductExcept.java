package com.company.sorting;
import java.util.Arrays;

public class ProductExcept {
    /**Product of Array Except Self*/
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        int output[] = new int[n];
        output[0] = 1;
        for(int i=1;i<n;i++){
            output[i] = arr[i-1] * output[i-1];
        }
        System.out.println(Arrays.toString(output));
        int prod = 1;
        for(int i=n-1;i>=0;i--){
            output[i] = output[i] * prod;
            prod = prod * arr[i];
        }
        System.out.println(Arrays.toString(output));
    }
}
