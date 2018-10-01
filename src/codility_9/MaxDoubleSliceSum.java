package codility_9;

public class MaxDoubleSliceSum {

	public static void main(String[] args) {
		int[] A = {3,2,6,-1,4,5,-1,2};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
		int sum = 0;
		
		for(int i = 0 ; i < A.length-2 ; i++){
			for(int j = i+1 ; j < A.length-1 ; j++){
				
				//Z from length-1 to Y
				for(int z = A.length-1 ; z > j ; z--){					
					if(j!=z-1){
						sum += A[z-1];
					}							
				}
			}
		}
		
		return sum;
	}
}
