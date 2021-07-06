package com.company.sorting;
import java.util.HashSet;
import java.util.Set;

public class RemoveRepeated {
    /**Remove repeated elements from array**/
    public static void main(String[] args) {
      int[]  arr = {9, 2, 7, 4, 7};
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
