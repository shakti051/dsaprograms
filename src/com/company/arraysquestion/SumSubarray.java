package com.company.arraysquestion;
import java.util.HashSet;
import java.util.Set;

public class SumSubarray {
    public static void main(String[] args) {
     int arr[] = {4 ,2 ,-3, 1, 6};
     int n = arr.length;
     boolean found = findsum( arr,n);
        System.out.println("Found: "+found);
    }

    static boolean findsum(int arr[],int n)
    {
        Set<Integer> hs = new HashSet<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            if (arr[i] == 0
                    || sum == 0
                    || hs.contains(sum))
                return true;
            hs.add(sum);
        }
        return false;
    }

    /**Below nested loop solution given**/
//    static boolean findsum(int arr[],int n)
//    {
//        boolean sumZero = false;
//
//        for (int i = 0; i < n; i++)
//        {       int sum = 0;
//            for (int j = i;j<n;j++){
//                sum += arr[j];
//                if (sum==0){
//                    sumZero = true;
//                    break;
//                }
//
//            }
//            if(sumZero)break;
//        }
//        return sumZero;
//    }
}