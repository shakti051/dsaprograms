package com.company.arraysquestion;

import java.util.Arrays;

public class TripletSum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6 ,10, 8};
        int n = arr.length;
        int sumBe = 15;
        boolean ans = find3Numbers(arr,n,sumBe);
        System.out.println("The given sum exist: "+ans);
    }
    public static boolean find3Numbers(int arr[], int n, int x) {
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int j= i+1;
            int k = n-1;
            int sum = x-arr[i];
            while(j<k){
                if(arr[j]+arr[k]==sum)
                    return true;
                if(arr[j]+arr[k]<sum)
                    j++;
                else
                    k--;
            }
        }
        return false;
    }
}
