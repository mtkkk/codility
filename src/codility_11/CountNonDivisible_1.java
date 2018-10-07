package codility_11;

public class CountNonDivisible_1 {

	public static void main(String[] args) {
		//int[] A = {3,1,2,3,6};
		//int[] A = {3};
		int[] A = {10000,2,10,3,7};
		System.out.println(solution(A));
	}
	
	public static int[] solution(int[] A){
		int[] result = new int[A.length];
		
		for(int i = 0 ; i < A.length ; i++){
			int nonDiv = 0;
			
			for(int j = 0 ; j < A.length ; j++){
				if(A[i] % A[j] != 0){
					nonDiv++;
				}
			}
			
			result[i] = nonDiv;
		}
		
		
		return result;
	}
}
//https://app.codility.com/demo/results/trainingRF8TYT-MGR/