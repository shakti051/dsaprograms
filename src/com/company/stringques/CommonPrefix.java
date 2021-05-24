package com.company.stringques;

public class CommonPrefix {
    public static void main(String[] args) {
        String arr[] = {"flower","flow","flight"};
        String prefix = longestCommonPrefix(arr);
        System.out.println("Longest prefix is: "+prefix);
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++)
        {   while(strs[i].indexOf(prefix)!=0)
            prefix = prefix.substring(0,prefix.length()-1);
        }
        return prefix;
    }
}
