package codility_15;

import java.util.Arrays;

public class MinAbsSumOfTwo_2 {

	public static void main(String[] args) {
		int[] A = {1,4,-3};
		//int[] A = {-8,4,5,-10,3};
		//int[] A = {1000000000,999999999}; 
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		int result = Math.abs(A[0]+A[0]);
		Arrays.sort(A);
		
		int tail = 0;
		int head = A.length-1;
		while(tail <= head){
			int currentSum = A[tail] + A[head];
			if(Math.abs(currentSum) < result){
				result = Math.abs(currentSum);
			}
			
			if(currentSum <= 0){
				tail++;
			} else {
				head--;
			}
		}
		
		return result;
	}
}
//https://app.codility.com/demo/results/trainingKQBUPU-E5S/