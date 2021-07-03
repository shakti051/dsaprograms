package com.company.interview;
import java.util.Scanner;

public class HTriangleNth {
    public static void main(String[] args) {
        int i,j,rows,cols,n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows: ");
         rows = scanner.nextInt();
         n=rows*2;
         cols = n-1;
        for (i=1;i<=rows;i++){
            for (j=1;j<=cols;j++){
                if (j>=i && j<=n-i)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}