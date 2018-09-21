package codility_3;

import java.util.stream.IntStream;


public class main {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,5};
		
		System.out.println(solution(a));
	}
	
	public static int solution(int[] A){
		int solutionNumber = 0;
		
		for(int i = 1 ; i <= A.length ; i++){						
			if(!containsValue(A, i)){
				return i;
			}
		}
		
		return solutionNumber;
	}
	
	public static boolean containsValue(int[] A, final int value){
		
		boolean contains = IntStream.of(A).anyMatch(x -> x == value);
		if(contains){
			return true;
		}
		
		return false;
	}
}
