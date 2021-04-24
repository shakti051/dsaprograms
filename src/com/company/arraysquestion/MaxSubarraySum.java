package com.company.arraysquestion;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(a));
    }

    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int sum_max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++)
        {       int sum = 0;
                for (int j = i;j<size;j++){
                    sum += a[j];
                    if (sum>sum_max)
                        sum_max=sum;
                }
        }
        return sum_max;
    }
}
