package com.company;
import java.util.Scanner;

public class RotateClock {
    /**Rotate array clockwise n anticlockwise **/
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of elements of array: ");//Enter 101
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[]arr = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0;i<n;i++)  // inserting n elements in the array;
            arr[i] = scanner.nextInt();
        System.out.println("\nThe array is : ");
        for (int i = 0;i<n;i++)  // inserting n elements in the array;
            System.out.print(arr[i]+" ");
        /**Logic to rotate clockwise **/
        int temp = arr[n-1];
        for (int i = n-1;i>0;i--)  // inserting n elements in the array;
                arr[i]= arr[i-1];
                arr[0]= temp; //for last element
            //   System.out.print(arr[i]+" ");

        System.out.println("\nThe clock-rotated array is : ");
        for (int i = 0;i<n;i++)  // inserting n elements in the array;
            System.out.print(arr[i]+" ");
        /**Logic to rotate anticlockwise **/
         temp = arr[0];
        for (int i = 0;i<n-1;i++)  // inserting n elements in the array;
            arr[i]= arr[i+1];
        arr[n-1]= temp;

        System.out.println("\nThe anti-rotated array is : ");
        for (int i = 0;i<n;i++)  // inserting n elements in the array;
            System.out.print(arr[i]+" ");
    }
}