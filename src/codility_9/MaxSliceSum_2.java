package codility_9;

public class MaxSliceSum_2 {

	public static void main(String[] args) {
		int[] A = {3,2,-6,4,0};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		int maxSum = A[0];
		
		for(int i = 0 ; i < A.length ; i++){
			int localSum = 0;
			
			for(int j = i ; j < A.length ; j++){
				localSum += A[j];
				
				if(localSum > maxSum){
					maxSum = localSum;
				}
			}
		}
		
		return maxSum;
    }
}
//https://app.codility.com/demo/results/training3UHYUF-9JY/