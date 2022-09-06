/*
Consider a Quiz Management System, where a user needs to answer 5 questions. 
If any of the answer is wrong, throw an exception “NotCorrectException”. 
If the answer is correct give a message “good! The answer is correct”.
 */
package com.exception;

public class MainNotCorrExp {
	public static void qestion(int arr[],int size) throws NotCorrectException {
		int i, flag=0;
		for(i=0;i<size;i++) {
			if(!(arr[i]==1||arr[i]==2||arr[i]==3||arr[i]==4||arr[i]==5)) {
				flag=1;
				break;
			}
			
		}
		if(flag==1)
		{
			throw new NotCorrectException("Ooo Sorry!!! your answer is Wrong ");
			}
			else {
				System.out.println(" Yes your all answers is correct ");
			}
		
	}
	public static void main(String args[]) {
		int arr[]= {1,2,3,9,4};
		int size=arr.length;
		try {
			MainNotCorrExp.qestion(arr,size);
		}
		catch(NotCorrectException ec) {
			System.out.println(ec.getMessage());

		}
	}

}
