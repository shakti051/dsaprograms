package com.company.sorting;

import java.util.ArrayList;

public class EqualIndex {
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
