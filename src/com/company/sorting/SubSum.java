package com.company.sorting;
//https://www.geeksforgeeks.org/split-the-given-array-into-k-sub-arrays-such-that-maximum-sum-of-all-sub-arrays-is-minimum/
public class SubSum {

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4 };
        int n = array.length;
        int K = 3;
        System.out.println(solve(array, n, K));
    }
    static boolean check(int mid, int array[], int n, int K)
    {

        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {

            // If individual element is greater
            // maximum possible sum
            if (array[i] > mid)
                return false;

            // Increase sum of current sub - array
            sum += array[i];

            // If the sum is greater than
            // mid increase count
            if (sum > mid) {
                count++;
                sum = array[i];
            }
        }
        count++;

        // Check condition
        if (count <= K)
            return true;
        return false;
    }

    // Function to find maximum subarray sum
    // which is minimum
    static int solve(int array[], int n, int K)
    {
        int start = 1;
        for (int i = 0; i < n; ++i) {
            if (array[i] > start)
                start = array[i];
        }
        int end = 0;

        for (int i = 0; i < n; i++) {
            end += array[i];
        }

        // Answer stores possible
        // maximum sub array sum
        int answer = 0;
        while (start <= end) {
            int mid = (start + end) / 2;

            // If mid is possible solution
            // Put answer = mid;
            if (check(mid, array, n, K)) {
                answer = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return answer;
    }
}
