package com.company.sorting;

public class Maxprofit {
    /**You are given an array. Each element represents the price of a stock on that particular day.
     *  Calculate and return the maximum profit you can make from buying and selling that stock only once.*/
    public static void main(String[] args) {
        int arr[] = { 9, 11, 8, 5, 7, 10 };
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0;i<arr.length;i++){
                minPrice = Math.min(minPrice,arr[i]);
              int currentProfit = arr[i]-minPrice;
                 maxProfit = Math.max(maxProfit,currentProfit);
        }
        System.out.printf("The max profit is: "+maxProfit);
    }
}
