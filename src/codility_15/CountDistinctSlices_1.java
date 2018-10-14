package codility_15;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctSlices_1 {

	public static void main(String[] args) {
		int M = 6;
		int[] A = {3,4,5,5,2};
		System.out.println(solution(M, A));
	}
	
	public static int solution(int M, int[] A) {
		//Since the pair (P,Q) where P=Q counts as a slice, initialize the count as the minimum which is the length of the array
		//Every positions will be a valid slice
		int count = A.length;
		
		for(int i = 0 ; i < A.length ; i++){
			Set<Integer> slice = new HashSet<Integer>();
			slice.add(A[i]);
			
			int j = i+1;
			while(j < A.length){
				if(!slice.add(A[j])){
					break;
				}
				j++;
			}
			
			if(slice.size() > 1){
				count += slice.size() -1;
			}
		}
		
		return count;
	}
}
//https://app.codility.com/demo/results/trainingW9VKAW-F7Y/