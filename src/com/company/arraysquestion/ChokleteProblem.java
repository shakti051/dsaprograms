package com.company.arraysquestion;
import java.util.Arrays;

public class ChokleteProblem {
    public static void main(String[] args) {
        int arr[] = {1,2,5,7,3};
        int m = 3;  // Number of students
        int n = arr.length;
        int result = distribute_chocolate(arr,n,m);
        System.out.println("The min diff is "+result);
    }
    static int distribute_chocolate(int []arr,int n,int m){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<=(n-m);i++){
                if((arr[m-1+i]-arr[i])<min){
                    min = arr[m-1+i]-arr[i];
                }
        }
        return min;
    }
}