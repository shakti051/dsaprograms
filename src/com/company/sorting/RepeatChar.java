package com.company.sorting;
import java.util.HashSet;
import java.util.Set;

public class RepeatChar {
    /**Remove Repeated charactes from a string**/
    public static void main(String[] args) {
        String str = "helloshubko";
        char[] str_ch = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i=0;i< str_ch.length;i++){
            set.add(str_ch[i]);
        }
        System.out.println(set);
    }
}