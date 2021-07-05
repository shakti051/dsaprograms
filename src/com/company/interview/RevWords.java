package com.company.interview;
import java.util.Scanner;

public class RevWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str= scanner.nextLine();
        String reverseString = "";
        String [] words = str.split(" ");
        for (int i=0;i<words.length;i++){
            String word = words[i];
            String reverseWord = "";
            for (int j= word.length()-1 ;j>=0; j--){
                  reverseWord += word.charAt(j);
            }
            reverseString += reverseWord+ " ";
        }
        System.out.println("reversed string: "+reverseString);
    }
}
