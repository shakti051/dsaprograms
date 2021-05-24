package com.company.arraysquestion;

public class SubArraySum {
    public static void main(String[] args) {

    }
    public static long sb(long a[], long n, long x) {
        long start = 0,end = 0;
        long ans = n+1;
        long sum = 0;
        while(end<n){
            while(sum<=x && end<n){
                sum += a[(int)end];
                end++;
            }
            while(sum>x && start <n){
                ans = Math.min(ans,end-start);
                sum -= a[(int)start];
                start++;
            }
        }
        return ans;
    }
}