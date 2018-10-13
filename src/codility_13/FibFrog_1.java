package codility_13;

import java.util.HashSet;
import java.util.Set;

public class FibFrog_1 {

	public static void main(String[] args) {
		//int[] A = {0,0,0,1,1,0,1,0,0,0,0};
		//int[] A = {1,0,0};
		int[] A = {0,0,0,1,1,1,0,1,0,0,0,0};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		int result = -1;
		int jumps = 0;
		Set<Integer> fib = new HashSet<Integer>();
		
		int a = 0;
		int b = 1;
		for(int i = 2 ; i < A.length ; i++){
			int sum = a + b;
			fib.add(sum);			
			a = b;
			b = sum;
		}
		
		//Tests if the frog can make it in one jump
		if(canJump(A.length, fib)){
			return 1;
		}
		
		for(int i = 0 ; i < A.length ; i++){
			jumps++;
			if(A[i] == 0){
				if(i==0){
					continue;
				} else if(A[i-1] == 1){
					jumps--;
					//The previous position has a leaf that the frog can jump
					if(canJump(jumps,fib)){
						result = jump(result);
						jumps = 1;
					} else {
						//If cant make the jump because its not fib number, returns position until can find somewhere to jump
						int j = i -1;
						jumps--;
						while(A[j] != 0){
							if(canJump(jumps,fib)){
								result = jump(result);
								jumps=i+1 - jumps;
								break;
							}
							j--;
						}
						
					}
					
					
				}
			}
		}
		
		jumps++;
		if(canJump(jumps, fib)){
			result++;
		}
		
		return result;
	}
	
	public static boolean canJump(int jumps, Set<Integer> fib){
		
		if(fib.contains(jumps)){
			return true;
		}
		
		return false;
	}
	
	public static int jump(int result){
		if(result == -1){
			result = 1;
		} else {
			result++;
		}
		
		return result;
	}
}
//https://app.codility.com/demo/results/training475JFB-3G9/
