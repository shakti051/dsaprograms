package com.company.sorting;
import java.util.HashSet;
import java.util.Set;

public class FindRepeated {
    /**Print repeated elements of an array**/
    public static void main(String[] args) {
        int []arr= {2, 10,10, 100, 2, 10, 11,2,11,2};
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j])
                    set.add(arr[i]);
            }
        }
        System.out.println(set);
    }
}
