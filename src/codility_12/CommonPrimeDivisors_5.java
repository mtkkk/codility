package codility_12;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CommonPrimeDivisors_5 {

	public static void main(String[] args) {
		int[] A = {15,15,10,9,7};
		int[] B = {60,75,30,5,21};
		System.out.println(solution(A, B));
	}
	
	public static int solution(int[] A, int[] B) {
		int count = 0;
		
		for(int i = 0 ; i < A.length ; i++){
			int gcd = gcd(A[i], B[i]);
			if(checkPrime(A[i], gcd) == 1 && checkPrime(B[i], gcd) == 1){
				count++;
			}
			
		}
		
		return count;
	}
	    

	public static int gcd(int a, int b){
		if(a % b == 0){
			return b;
		} else {
			return gcd(b, a%b);
		}
	}
	
	public static int checkPrime(int a, int b){
		while(a != 1){
			int local_gcd = gcd(a, b);
			
			if(local_gcd == 1){
				break;
			}
			
			a /= local_gcd;
		}
		
		return a;
	}
}
//https://app.codility.com/demo/results/trainingBSSWW8-DPY/