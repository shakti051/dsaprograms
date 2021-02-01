package com.company;

import java.util.Scanner;

public class MoveNegative {
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
    }
}