package com.company.intarray;

public class ProdSubArray {
    /**Maximum Product Subarray**/
    public static void main(String[] args) {
        int arr[] = { 1, -2, -3, 0, 7, -8, -2 };
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            int mul = arr[i];
            for (int j=i+1;j<arr.length;j++){
                mul = mul *arr[j];
                max = Math.max(mul,max);
            }
        }
        System.out.println("The max sum: "+max);
    }
}
