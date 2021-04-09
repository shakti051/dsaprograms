package com.company;
import java.util.HashSet;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of elements first array: ");//Enter 101
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[]arr1 = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0;i<n;i++)  // inserting n elements in the array;
            arr1[i] = scanner.nextInt();
        System.out.println("\nThe first array is : ");
        for (int i = 0;i<n;i++)  // inserting n elements in the array;
            System.out.print(arr1[i]+" ");
        System.out.print("\nEnter the number of elements second array: ");//Enter 101
        n = scanner.nextInt();
        int[]arr2 = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0;i<n;i++)  // inserting n elements in the array;
            arr2[i] = scanner.nextInt();
        System.out.println("\nThe second array is : ");
        for (int i = 0;i<n;i++)  // inserting n elements in the array;
            System.out.print(arr2[i]+" ");
        printUnion(arr1, arr2);
        System.out.println("\nThe Intersection is :");
        printIntersection(arr1, arr2);
    }

    static void printUnion(int arr1[], int arr2[])
    {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);
        for (int i = 0; i < arr2.length; i++)
            hs.add(arr2[i]);
        System.out.println("\nThe union is :");
        System.out.println(hs);
    }

    static void printIntersection(int arr1[], int arr2[])
    {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);

        for (int i = 0; i < arr2.length; i++)
            if (hs.contains(arr2[i]))
                System.out.print(arr2[i] + " ");
    }
}