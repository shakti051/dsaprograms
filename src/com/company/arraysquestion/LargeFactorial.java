package com.company.arraysquestion;
import java.math.BigInteger;

public class LargeFactorial {
    public static void main(String args[]) throws Exception
    {
        int N = 20;
        System.out.println(factorial(N));
    }
    static BigInteger factorial(int N) {

        BigInteger f
                = new BigInteger("1"); // Or BigInteger.ONE
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }
}
