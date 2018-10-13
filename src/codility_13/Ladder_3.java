package codility_13;

import java.math.BigInteger;

public class Ladder_3 {

	public static void main(String[] args) {
		int[] A = {4,4,5,5,1};
		int[] B = {3,2,4,3,1};
		solution(A, B);
	}
	
	public static int[] solution(int[] A, int[] B) {
		int result[] = new int[A.length];
		
		BigInteger[] fib = new BigInteger[A.length+2];
		fib[0] = new BigInteger("0");
		fib[1] = new BigInteger("1");
		fib[2] = new BigInteger("1");
		
		//Will fill all fibonacci values up to L, stored by a modulo 2^30
		for(int i = 3 ; i <= A.length+1 ; i++){
			fib[i] = fib[i-1].add(fib[i-2]);			
		}
		
		for(int i = 0 ; i < A.length ; i++){			
			BigInteger exp = new BigInteger("2").pow(B[i]); 
			
			result[i] = fib[A[i]+1].mod(exp).intValue();
		}
		return result;
	}
}
//https://app.codility.com/demo/results/trainingNFCZVT-FQB/