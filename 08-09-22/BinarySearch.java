package com.ds.java;
public class BinarySearch {
    public static int binarySearch(int arr[],int start,int end,int mid,int item){
    while (start<=end){
        mid=(start+end)/2;

        if(arr[mid]==item) {
            return 1;
        }
        if(arr[mid] > item){
             end=mid-1;
        }
         else{
             start=mid+1;
         }
    }
    return -1;
    }
    public static void main(String[] args) {
int arr[]={1,2,3,4,5,6,7,8,9};
int start=0,end=arr.length-1,mid;
mid=(start+end)/2;
 int result=binarySearch(arr,start,end,mid,1);
 if(result==-1){
     System.out.println("The element is not found ");
 }
 else{
     System.out.println("The element is found ");
 }

    }
}
