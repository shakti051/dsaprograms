package com.company.arraysquestion;

import java.util.Scanner;

public class InversionCount {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of elements of array: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[]arr = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0;i<n;i++)  // inserting n elements in the array;
            arr[i] = scanner.nextInt();
        int count = getInvCount(n,arr);

        System.out.println("The Inversion count is: "+count);
        System.out.println("The array is : ");
        for (int i = 0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    static int getInvCount(int n,int arr[])
    {
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    inv_count++;
        return inv_count;
    }
}
