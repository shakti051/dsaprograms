package com.company.stringques;

import java.util.Arrays;
import java.util.Scanner;

public class StrLength {
//    public static String ArrayChallenge(String strArr) {
//        // Arrays.sort(strArr) ;
//
//        int n = strArr.length();
//        String temp;
//        for (int i = 0; i < strArr.length()-1; i++)
//        {
//            for (int j = i + 1; j < strArr.length(); j++)
//            {
//                if (strArr[i].compareTo(strArr[j])>0)
//                {
//                    temp = strArr[i];
//                    strArr[i] = strArr[j];
//                    strArr[j] = temp;
//                }
//            }
//        }
//
//
//        return strArr[n-3];
//    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        //System.out.print(ArrayChallenge(s.nextLine()));
        String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
        int size = countries.length;
//logic for sorting
        for(int i = 0; i<size-1; i++)
        {
            for (int j = i+1; j<countries.length; j++)
            {
//compares each elements of the array to all the remaining elements
                if(countries[i].compareTo(countries[j])>0)
                {
//swapping array elements
                    String temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
//prints the sorted array in ascending order
        System.out.println(Arrays.toString(countries));

    }

}
