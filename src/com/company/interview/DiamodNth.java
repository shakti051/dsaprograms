package com.company.interview;
import java.util.Scanner;

public class DiamodNth {
    public static void main(String[] args) {
        int i,j,n,k=0,rows,cols;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        rows = scanner.nextInt();
        cols = rows;
        n= (rows+1)/2;
        for (i=1;i<=rows;i++){
            if(rows%2==0){
                if(i<=n)k++;if (i>n+1)k--;
            }else if (i<=n)k++;else k--;
           for (j=1;j<=cols;j++){
               if(j>=n+1-k && j<=n-1+k)
                   System.out.print("*");
               else System.out.print(" ");
           }
            System.out.println("");
        }
    }
}
