package com.company.sorting;
import java.util.HashMap;

public class LSumZero {
    /**Length of largest sub array with sum 0*/
    public static void main(String[] args) {
        int arr[] = {2,8,-3,-5,2,-4,6,1,2,1,-3,4};
        HashMap<Integer,Integer> map = new HashMap<>();
        int mLen = 0;
        int  i = -1;
        int sum = 0;
        map.put(sum,i);
        while (i< arr.length-1){
            i++;
            sum += arr[i];
            if (map.containsKey(sum)==false){
                map.put(sum,i);
            }else {
                int len = i - map.get(sum);
                if (len>mLen)
                    mLen = len;
            }
        }
        System.out.println("The max length is: "+mLen);
    }
}