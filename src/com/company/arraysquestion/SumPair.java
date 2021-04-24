package com.company.arraysquestion;

import java.util.Scanner;

public class SumPair {
    public static void main(String[] args) {
        int n,sum;
        System.out.print("Enter the number of elements of array: ");//Enter 101
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[]arr = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0;i<n;i++)  // inserting n elements in the array;
            arr[i] = scanner.nextInt();
        System.out.print("Enter the sum: ");
        sum = scanner.nextInt();
        int count = getPairsCount(arr, n,sum);

        System.out.println("The count pairs is: "+count);
        System.out.println("The array is : ");
        for (int i = 0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    static int getPairsCount(int[] arr, int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] + arr[j] == k)
                    count++;
        return count;
    }
}
