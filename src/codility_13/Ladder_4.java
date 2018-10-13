package codility_13;

public class Ladder_4 {

	public static void main(String[] args) {
		int[] A = {4,4,5,5,1};
		int[] B = {3,2,4,3,1};
		solution(A, B);
	}
	
	public static int[] solution(int[] A, int[] B) {
		int result[] = new int[A.length];
		int maxMod = (int) Math.pow(2, 30);
		
		int[] fib = new int[A.length+2];
		fib[0] = 0;
		fib[1] = 1;
						
		//Will fill all fibonacci values up to L, stored by a modulo 2^30
		for(int i = 2 ; i <= A.length+1 ; i++){
			int mod = (fib[i-1] + fib[i-2]) % maxMod ;
			fib[i] = mod;
		}
		
		for(int i = 0 ; i < A.length ; i++){
			int exp = (int) Math.pow(2, B[i]);
			
			result[i] = (fib[A[i]+1] % exp);
		}
		return result;
	}
}
//https://app.codility.com/demo/results/training4XG7QS-T4K/
//100%