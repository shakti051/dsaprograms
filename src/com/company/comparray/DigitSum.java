package com.company.comparray;
/**Finding sum of digits of a number until sum becomes single digit**/
public class DigitSum {
    public static void main(String[] args) {
        int n = 5674;
        System.out.println(digSum(n));
    }
    static int digSum(int n)
    {
        if (n == 0)
            return 0;
        return (n % 9 == 0) ? 9 : (n % 9);
    }
}
