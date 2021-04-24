package com.company.arraysquestion;
import java.util.Scanner;

public class SortWithoutAlgo {
   /**Sort array of 0,1 and 2 without any sorting algo **/
    public static void main(String[] args) {
        int n;
        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;
        System.out.print("Enter the number of elements of array: ");//Enter 101
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[]arr = new int[n];

        System.out.println("Enter elements 0 , 1 n 2: ");

        for ( i = 0;i<n;i++)  // inserting n elements in the array;
            arr[i] = scanner.nextInt();

        System.out.println("The array is: ");
        for (i = 0;i<n;i++)  // inserting n elements in the array;
            System.out.print(arr[i]+" ");

        for (i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }
        // Update the array
        i = 0;

        // Store all the 0s in the beginning
        while (cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }

        // Then all the 1s
        while (cnt1 > 0) {
            arr[i++] = 1;
            cnt1--;
        }

        // Finally all the 2s
        while (cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }
        System.out.println("\nSorted Array is : ");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}