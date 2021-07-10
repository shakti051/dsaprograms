package com.company.sorting;
import java.util.Arrays;

public class FourSum {
    /**Find four elements that sum to a given value*/
    public static void main(String[] args) {
        int arr[] = { 1, 2, -3, 4, -2, -1, 3 };
        int n = arr.length;
        int targetSum = 3;
        int start, end;
        Arrays.sort(arr);

        for (int i = 0; i < n - 3; i++)
        {
            for (int j = i + 1; j < n - 2; j++)
            {
                start = j + 1;
                end = n - 1;
                while (start < end)
                {
                    if (arr[i] + arr[j] + arr[start] + arr[end] == targetSum)
                    {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[start]+" "+arr[end]);
                        start++;
                        end--;
                    }
                    else if (arr[i] + arr[j] + arr[start] + arr[end] < targetSum)
                        start++;
                    else
                        end--;
                }
            }
        }
    }
}
