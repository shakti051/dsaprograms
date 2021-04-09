package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
        /**Find the kth smallest element of an Array. **/
    public static void main(String[] args) {
        int n,k;
        System.out.print("Enter the number of elements of array: ");//Enter 101
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[]arr = new int[n];

        System.out.println("Enter elements in sorted and consecutive order: ");

        for (int i = 0;i<n;i++)  // inserting n elements in the array;
            arr[i] = scanner.nextInt();
        System.out.print("Enter the value of k: ");
        k = scanner.nextInt();
        Arrays.sort(arr);
        System.out.print("The required element is : "+arr[k-1]);
    }
}