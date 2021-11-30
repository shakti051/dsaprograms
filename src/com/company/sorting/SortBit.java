package com.company.sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortBit {
    public static void main(String[] args) {
     // Integer   arr[] = {5, 2, 3, 9, 4, 6, 7, 15, 32};
      Integer  arr[] = {1, 2, 3, 4, 5, 6};
        sortBySetBitCount(arr, arr.length);
    }
    static void sortBySetBitCount(Integer arr[], int n)
    {
        ArrayList<Integer> res=new ArrayList<>(Arrays.asList(arr));
        Collections.sort(res,(n1, n2)->{
            if(Integer.bitCount(n1)>Integer.bitCount(n2))
                return -1;
            if(Integer.bitCount(n1)<Integer.bitCount(n2))
                return 1;
            return 0;
        });

        int i=0;
        for(Integer item:res){
            //arr[i++]=item;
            System.out.print(item+" ");
        }
    }
}
