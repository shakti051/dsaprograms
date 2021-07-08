package com.company.sorting;
import java.util.HashSet;
import java.util.Set;

public class PrintRepChar {
    /**Print Repeated charactes from a string**/
    public static void main(String[] args) {
        String str = "helloshubko";
        char[] str_ch = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i=0;i< str_ch.length;i++){
            for (int j=i+1;j< str_ch.length;j++){
                if (str_ch[i]==str_ch[j])
                       set.add(str_ch[i]);
            }
        }
        System.out.println(set);
    }
}
