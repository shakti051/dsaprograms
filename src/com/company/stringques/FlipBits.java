package com.company.stringques;
import java.util.Scanner;
/**Count number of bits to be flipped to convert A to B**/
public class FlipBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int a  = scanner.nextInt();
        System.out.print("Enter second num: ");
        int b = scanner.nextInt();
        int flip = a^b;
        int count =0;
        while (flip>0){
            flip = flip&(flip-1); /**count number of one**/
            count++;
        }
        System.out.println("The flip bits are: "+count);
    }
}
