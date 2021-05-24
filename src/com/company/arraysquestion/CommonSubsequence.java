package com.company.arraysquestion;
import java.util.HashSet;
import java.util.Set;

public class CommonSubsequence {
    public static void main(String[] args) {
      int   arr[] = {2,6,1,9,4,5,3};
      int n = arr.length;
      int result = findLongestConseqSubseq(arr,n);
        System.out.println("Longest consecutive subquence: "+result);
    }

    static int findLongestConseqSubseq(int arr[], int n)
    {
        Set<Integer> set = new HashSet<>();
        for(int i:arr)
            set.add(i);

        int ans = 0;
        for(int i=0;i<n;i++){
            if(!set.contains(arr[i]-1)){
                int j = arr[i]+1;
                while(set.contains(j))
                    j++;
                ans = Math.max(ans,j-arr[i]);

            }
        }
        return ans;
    }
}