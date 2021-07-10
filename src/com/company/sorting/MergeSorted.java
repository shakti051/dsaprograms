package com.company.sorting;

public class MergeSorted {
    /**Merge two sorted arrays*/
    public static void main(String[] args) {
       int arr1[] = { 1, 3, 4, 5};
       int arr2[] = {2, 4, 6, 8};
       int arr3[] = new int[arr1.length+ arr2.length];
       int i=0,j=0,k=0;
       while (i< arr1.length && j< arr2.length ){
           if (arr1[i]<arr2[j])
               arr3[k++]=arr1[i++];
           else arr3[k++]=arr2[j++];
       }
       while (i<arr1.length)
           arr3[k++]=arr1[i++];
       while (j<arr2.length)
           arr3[k++]=arr2[j++];
       for (i=0;i< arr3.length;i++)
        System.out.print(arr3[i]+" ");
    }
}
