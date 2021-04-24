package com.company.arraysquestion;

import java.util.Scanner;

public class MaxProfit {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of elements of array: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[]arr = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0;i<n;i++)  // inserting n elements in the array;
            arr[i] = scanner.nextInt();
        int maxProfit = maxProfit(arr);

        System.out.println("The maxProfit  is: "+maxProfit);
        System.out.println("The array is : ");
        for (int i = 0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
    /**The following is brooth force approach**/
//    static int maxProfit(int prices[]) {
//        int maxprofit = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                int profit = prices[j] - prices[i];
//                if (profit > maxprofit)
//                    maxprofit = profit;
//            }
//        }
//        return maxprofit;
//    }
}