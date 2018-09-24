package codility_4;

import java.util.HashSet;

public class MissingInteger_1 {

	public static void main(String[] args) {
		int[] A = {-1,-3};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
		int smallestInt = 1;
		int highestInt = 0;
		boolean firstIteration = true;
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		for(int i = 0 ; i < A.length ; i++){
			if(A[i] > 0){
				numbers.add(A[i]);
				if(smallestInt == A[i]){
					smallestInt++;
					while(numbers.contains(smallestInt)){
						smallestInt++;
					}
				}
			}			
		}
		
		return smallestInt;
	}
}
