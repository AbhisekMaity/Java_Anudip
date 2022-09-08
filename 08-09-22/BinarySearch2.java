package com.ds.java;
import java.util.Scanner;
public class BinarySearch2 {
    public static int binarySearch(int arr[], int start, int end, int mid, int item) {
        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == item) {
                return mid;
            }
            if (arr[mid] > item) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void inputVal(int arr [],int element) {

        int start = 0, end = arr.length - 1, mid;
        mid = (start + end) / 2;
        int result = binarySearch(arr, start, end, mid,element);
        if (result == -1) {
            System.out.println("The element is not found ");
        } else {
            System.out.println("The element is found at index " +result);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many element you want");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter the array element one by one(It must be sorted way) ");
        for (int i = 0; i < size ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Please enter the element which we want to search ");
        int element=sc.nextInt();
        inputVal(arr,element);
    }
}

