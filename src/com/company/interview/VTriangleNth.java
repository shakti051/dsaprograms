package com.company.interview;
import java.util.Scanner;

public class VTriangleNth {
    public static void main(String[] args) {
        int i,j,k=0,rows,cols,n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows: ");
        rows = scanner.nextInt();
        n= (rows+1)/2;
        cols = n;
        for (i=1;i<=rows;i++){
            if (rows%2==0){
                if (i<=n)k++;if (i>n+1)k--;
            }else if (i<=n)k++;else k--;
            for (j=1;j<=cols;j++){
                if(j<=k)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
