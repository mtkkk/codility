package codility_9;

public class MaxProfit_2 {

	public static void main(String[] args) {
		int[] A = {23171,21011,21123,21366,21013,21367};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
		int maxProfit = 0;
		
		for(int i = 0 ; i < A.length-1 ; i++){
			for(int j = i+1 ; j < A.length ; j++){
				if(A[j] - A[i] > maxProfit){
					maxProfit = A[j] - A[i];
				}
			}
		}
		
		return maxProfit;
	}
}
