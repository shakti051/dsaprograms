package com.company.sorting;

public class FirstLast {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                last = i;
                if (first == -1)
                    first = i;
            }
        }
        System.out.println("first: " + first + ",last: " + last);
    }
}
