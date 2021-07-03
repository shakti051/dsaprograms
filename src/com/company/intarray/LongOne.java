package com.company.intarray;
import java.util.Scanner;
/**Length of the Longest Consecutive 1s in Binary Representation**/

public class LongOne {
    public static void main(String[] args) {
        int number,count =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ehter number: ");
        number = scanner.nextInt();
        while (number>0){
            number = number&(number<<1);
            count++;
        }
        System.out.println("The longest consecutive one: "+count);
    }
}
