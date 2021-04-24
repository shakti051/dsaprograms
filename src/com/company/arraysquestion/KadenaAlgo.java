package com.company.arraysquestion;

public class KadenaAlgo {
    public static void main(String[] args) {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(a));
    }

    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max = a[0];
        int max_so_far = a[0];
        for (int i=1;i<size;i++){
                max_so_far = Math.max(a[i],max_so_far+a[i]);
                if (max_so_far>max)
                    max = max_so_far;
        }
        return max;
    }
}