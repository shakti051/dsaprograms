package com.company.sorting;

public class SingleStr {
        /**Print non repeated words from string Array**/
        public static void main(String[] args) {
        String[] words = {"big","black","bug","black","dog","on","big","hello"};
        for (int i = 0; i < words.length; i++) {
            int count =0;
            for (int j = 0; j < words.length; j++) {
                if (words[i] == words[j] && i!=j)
                {count++;break;}
            }
            if (count==0)
                System.out.print(words[i]+" ");
        }
    }
}
