package com.company.sorting;

public class Middle {
    /**Given three distinct numbers A, B and C. Find the number with value in middle (Try to do it with minimum comparisons).**/
    public static void main(String[] args) {
        int a = 20, b = 30, c = 40;
        if((a>b && a<c)||(a>c && a<b))
            System.out.println(a);
        else if((b>a && b<c)||(b>c && b<a))
            System.out.println(b);
        else System.out.println(c);;
    }
}
