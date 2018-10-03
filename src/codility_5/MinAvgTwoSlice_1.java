package codility_5;

public class MinAvgTwoSlice_1 {

	public static void main(String[] args) {
		int[] A = {4,2,2,5,1,5,8};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
		int minAvgPosition = 0;
		double minAvg = A[0];
		
		for(int i = 0 ; i < A.length-1 ; i++){		
			double auxSum = A[i];
			
			for(int j = i+1 ; j < A.length ; j++){
				auxSum += A[j];
				
				double auxAvg = auxSum / ((j-i) + 1);
				if(auxAvg < minAvg){ //If this slice average is lower, assign minAvg
					minAvg = auxAvg;
					minAvgPosition = i;
				};
			}
		}
		
		return minAvgPosition;
	}
		
}
//https://app.codility.com/demo/results/trainingKZ5Z8X-SFA/