package com.company;
import java.util.Scanner;

public class SubMaxSum {
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
        for (int i = 0;i<n;i++)
            System.out.print(arr[i]+" ");
        int max_sum = maxSubArraySum(arr, n);
        System.out.println("Maximum contiguous sum is "
                + max_sum);
    }

    static int maxSubArraySum(int a[], int size)
    {
        int max_so_far = a[0];
        int curr_max = a[0];

        for (int i = 1; i < size; i++)
        {
            curr_max = Math.max(a[i], curr_max+a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }
}