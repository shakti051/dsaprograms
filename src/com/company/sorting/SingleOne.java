package com.company.sorting;

public class SingleOne {
    /**  Find the element that appears once in an array where every other element appears twice**/
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 5, 3, 4};
        int res = arr[0];
        for (int i=1;i<arr.length;i++){
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
}
