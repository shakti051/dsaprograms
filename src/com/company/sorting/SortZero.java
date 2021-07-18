package com.company.sorting;
import java.util.Arrays;

public class SortZero {
    /**Sort arrays of 0s ,1s n 2s in order of one*/
    public static void main(String[] args) {
       int arr[] =  {1, 0, 2, 2, 0, 2, 1, 2, 1, 1, 2, 0};
        System.out.println("Array Before Sorting : "+ Arrays.toString(arr));
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while (mid <= high)
        {
            if (arr[mid] == 0)
            {
//               int temp = arr[low];
//               arr[low] = arr[mid];
//               arr[mid] = temp;
                 swap(arr, low, mid);
                low++;
                mid++;
            }
            if (arr[mid]==1)
                mid++;
             if (arr[mid] == 2) {
//                int temp = arr[mid];
//                arr[mid] = arr[high];
//                arr[high] = temp;
                 swap(arr, mid, high);
                high--;
            }
        }
        System.out.println("Array After Sorting : "+Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
