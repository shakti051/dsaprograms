package com.company.arraysquestion;
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
        for (int i = 0;i<n;i++)
            System.out.print(arr[i]+" ");
        int left  = 0,right = n-1;
        /**Logic Implemented below **/

        while (left <= right){
            if (arr[left] < 0 && arr[right] < 0)
                left++;
            else if (arr[left] > 0 && arr[right] > 0)
                right--;
            else if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("\nThe output is : ");
        for (int i = 0;i<n;i++)  // inserting n elements in the array;
            System.out.print(arr[i]+" ");
    }
}