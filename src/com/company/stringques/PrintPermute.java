package com.company.stringques;

import java.util.Scanner;

public class PrintPermute {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutations(str,"");
        scn.close();
    }

    private static void printPermutations(String str, String asf) {
                if(str.length()==0){
                    System.out.println(asf);
                return;
                }
         for(int i=0;i<str.length();i++){
             char ch = str.charAt(i);
             String strLpart = str.substring(0,i);
             String strRpart = str.substring(i+1);
             String rofStr = strLpart+strRpart;
             printPermutations(rofStr,asf+ch);
         }
    }
}
