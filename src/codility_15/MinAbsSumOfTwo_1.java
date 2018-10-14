package codility_15;

public class MinAbsSumOfTwo_1 {

	public static void main(String[] args) {
		//int[] A = {1,4,-3};
		int[] A = {-8,4,5,-10,3};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		int result = Math.abs(A[0]);
		
		for(int i = 0 ; i < A.length ; i++){
			for(int j = i ; j < A.length ; j++){
				if(Math.abs(A[i]+A[j]) < result){
					result = Math.abs(A[i]+A[j]);
				}
			}
		}
		
		return result;
	}
}
//https://app.codility.com/demo/results/trainingBZU7ST-JHU/