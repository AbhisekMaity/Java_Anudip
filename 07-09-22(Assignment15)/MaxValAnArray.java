package com.java.Junit;

public class MaxValAnArray {
    public int findMax(int arr[],int size) {
    	int i;
    	int max=arr[0];
    	for(i=0;i<size;i++) {
    		if(arr[i]>max) {
    			max=arr[i];
    		}
    	}
    	return max;
    }
}
