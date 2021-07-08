package com.company.interview;
public class SIngleChar {
    /**Print non Repeating charactes from a string**/
    public static void main(String[] args) {
        String str = "helloshubkoakzx";
        char[] str_ch = str.toCharArray();

        for (int i=0;i< str_ch.length;i++){
            int count =0;
            for (int j=0;j< str_ch.length;j++){
                if (str_ch[i]==str_ch[j] && i!=j)
                {count++;
                break;
                }
            }
              if (count==0)
                  System.out.print(str_ch[i]+" ");
        }
    }
}
