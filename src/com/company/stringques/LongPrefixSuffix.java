package com.company.stringques;

public class LongPrefixSuffix {
    public static void main(String[] args) {
        String str = "acdkac";
        String prefix = longestPrefix(str);
        System.out.println(prefix);
    }

      static String longestPrefix(String str) {
        int length=str.length();
        String suffix = "";

        int mid=length/2;
        if(length<2){
            System.out.println("");
        }
        for(int i=mid;i>=0;i--){
            String prefix=str.substring(0,i);
            suffix=str.substring(length-i,length);
            if(suffix.equals("") || prefix.equals("")){
                System.out.println("");
            }
            if(suffix.equals(prefix)){
                System.out.println(suffix.length());
                break;
            }
        }
        return suffix;
    }
}