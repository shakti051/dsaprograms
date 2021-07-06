package com.company.sorting;

import java.util.HashSet;
import java.util.Set;

public class RepeatedStr {
    /**Print repeated words from string Array**/
    public static void main(String[] args) {
        String[] words = {"big","black","bug","black","dog","on","big"};
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i] == words[j])
                    set.add(words[i]);
            }
        }

        System.out.println(set);
    }
}
