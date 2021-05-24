package com.company.arraysquestion;

public class MaxProductSubArray {
    public static void main(String[] args) {


    }

    static int maxProduct(int[] nums) {
        int length = nums.length;
        if(length==0) return 0;
        int min = nums[0];
        int max = nums[0];
        int result = nums[0];

        for(int i=1;i<length;i++){
            int temp_max = Math.max(nums[i]*max,Math.max(nums[i]*min,nums[i]));
            min = Math.min(nums[i]*max,Math.min(nums[i]*min,nums[i]));
            max = temp_max;
            result = Math.max(result,max);
        }
        return result;
    }

    static int maxSubarrayProduct(int arr[])
    {
        int result = arr[0];
        int n = arr.length;

        for (int i = 0; i < n; i++)
        {
            int mul = arr[i];
            for (int j = i + 1; j < n; j++)
            {
                result = Math.max(result, mul);
                mul *= arr[j];
            }
            result = Math.max(result, mul);
        }
        return result;
    }
}
