package com.company.arraysquestion;
import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    /**Merge two sorted array without any extra space.**/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n= sc.nextInt();
        int a[] = new int[m];
        int b[] = new int[n];
        int result[] = new int[m+n];

        for (int i=0;i<m;i++){
            a[i] = sc.nextInt();
        }

        for (int j=0;j<n;j++){
            b[j]= sc.nextInt();
        }
        int i= m-1;
        int j = 0;
        while (i>=0 && j<n){
            int temp;
            if (a[i]>b[j]){
               temp = a[i];
               a[i] = b[j];
               b[j] = temp;
            }
            i--;
            j++;
        }
        Arrays.sort(a);
        Arrays.sort(b);

        for (i=0;i<m;i++){
            result[i] = a[i];
        }

        for (i=0;i<n;i++){
            result[m+i] = b[i];
        }

        System.out.println("The result array is: ");
        for (i=0;i<m+n;i++){
            System.out.print(result[i]+" ");
        }
    }
}