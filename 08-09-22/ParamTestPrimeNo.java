package com.JUnit_Testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

class ParamTestPrimeNo {

	@ParameterizedTest
	@ValueSource(ints= {1,2,7,5,19,31})
	void test_prime(int n){
		
		int i;
		int flag=0;
		if(n==1) {
			flag=1;
		}
		for(i=2;i<n;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		assertTrue(flag==0);
		
	}
	

}
