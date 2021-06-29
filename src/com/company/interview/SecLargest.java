package com.company.interview;

public class SecLargest {
    public static void main(String[] args) {
       int a[]=  {43,48,56,78,65,45,35,39};
       int n = a.length;
        int   largest = a[0];
        int second = a[1];
        if(a[0]<a[1] ){
            int temp = largest;
            largest = second;
            second = temp;
        }
        for(int i=2;i<n-1;i++){
            if(a[i]> largest ){
                second = largest;
                largest = a[i];
            } else {
                if(a[i]> second)
                    second = a[i];
            }
        }
        System.out.println(second);
    }
}