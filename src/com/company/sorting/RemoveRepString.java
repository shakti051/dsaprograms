package com.company.sorting;

import java.util.HashSet;
import java.util.Set;

public class RemoveRepString {
    /**Remove repeated word in string array.**/
    public static void main(String[] args) {
        String str = "big black bug bit a big black dog on his big black nose";
        String[]words = str.split(" ");
        Set<String> set = new HashSet<>();
        for (int i=0;i<words.length;i++){
            set.add(words[i]);
        }
        System.out.println(set);
    }
}
