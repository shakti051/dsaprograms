package com.company.arraysquestion;

public class RainWater {
    public static void main(String[] args) {
       int  arr[] = {3,0,0,2,0,4};
       int n = arr.length;
       int waterUnit = trappingWater(arr,n);
        System.out.println("Unit of water can be stored: "+waterUnit);
    }
    static int trappingWater(int arr[], int n) {

        int left[] = new int[n];
        int right[] = new int[n];
        int water = 0;
        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);

        for (int i = 0; i < n; i++)
            water += Math.min(left[i], right[i]) - arr[i];
        return water;
    }
}
