package codility_15;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctSlices_2 {

	public static void main(String[] args) {
		int M = 6;
		int[] A = {3,4,5,5,2};
		System.out.println(solution(M, A));
	}
	
	public static int solution(int M, int[] A) {		
		int count = 0;
		Set<Integer> slice = new HashSet<Integer>();
		int j = 0;
		
		for(int i = 0 ; i < A.length ; i++){						
						
			while(j < A.length && slice.add(A[j])){
				j++;
			}
			
			if(!slice.isEmpty()){
				count += slice.size();
			}
			
			slice.remove(A[i]);
		}
		
		return count;
	}
}
//https://app.codility.com/demo/results/training272BUN-Y9P/