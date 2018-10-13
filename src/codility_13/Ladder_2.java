package codility_13;

import java.util.HashMap;
import java.util.Map;

public class Ladder_2 {

	public static void main(String[] args) {
		int[] A = {4,4,5,5,1};
		int[] B = {3,2,4,3,1};
		solution(A, B);
	}
	
	public static int[] solution(int[] A, int[] B) {
		int result[] = new int[A.length];
		
		int[][] fib = new int[A.length+2][2];
		fib[0][0] = 0;
		fib[0][1] = 0;
				
		fib[1][0] = 1;
		fib[1][1] = 0;
		
		fib[2][0] = 1;
		fib[2][1] = 0;
		
		//Will fill all fibonacci values up to L, stored by a modulo 2^30
		for(int i = 3 ; i <= A.length+1 ; i++){
			int mod = (int) ((fib[i-1][0] + fib[i-2][0]) % Math.pow(2, 30));
			int mult = (int) ( ( (fib[i-1][0] + fib[i-1][1]*Math.pow(2, 30)) + (fib[i-2][0] + fib[i-2][1]*Math.pow(2, 30)) ) / Math.pow(2, 30));
			fib[i][0] = mod;
			fib[i][1] = mult;
		}
		
		for(int i = 0 ; i < A.length ; i++){
			int exp = (int) Math.pow(2, B[i]);
			
			result[i] = (int) ( (fib[A[i]+1][0] + fib[A[i]+1][1]*Math.pow(2, 30)) % exp);
		}
		return result;
	}
}
//https://app.codility.com/demo/results/trainingPDP36D-GEN/