package com.company.sorting;

public class FIndSingle {
    /**Find non repeating elements in an array**/
     public static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 5, 3, 4, 1, 8};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    count++;
                    break;
                }
            }
            if (count == 0)
                System.out.print(arr[i] + " ");
        }
    }
}
