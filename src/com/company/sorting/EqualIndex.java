package com.company.sorting;
import java.util.ArrayList;

public class EqualIndex {
    /**Given an array Arr of N positive integers.
     * Your task is to find the elements whose value is equal to that of its index value.*/
    public static void main(String[] args) {
      int  arr[] = {15, 2, 45, 4,12, 7};
        ArrayList<Integer> val = new ArrayList<>();
        for (int i=0;i< arr.length;i++){
            if (arr[i]==i+1)
                val.add(arr[i]);
        }
        System.out.println(val);
    }
}
