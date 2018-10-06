package codility_9;

public class MaxDoubleSliceSum {

	public static void main(String[] args) {
		//int[] A = {3,2,6,-1,4,5,-1,2};
		int[] A = {3,2,6,-1,4,5,-1,2};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
		int highestSum = 0;
		int[] sumArray = new int[A.length];
		int rightSum;
		int leftSum;
		
		//Saving the sum at each position
		for(int i = 0 ; i < A.length ; i++){
			if(i==0){
				sumArray[0] = A[i];
			} else {
				sumArray[i] = sumArray[i-1] + A[i];
			}
		}
		
		for(int i = 0 ; i < A.length-2 ; i++){
			rightSum = 0;
			leftSum = 0;
			for(int j = i+1 ; j < A.length-1 ; j++){
				
				if(j-1 == i){
					leftSum = 0;
				} else {					
					leftSum = sumArray[j-1] - sumArray[i];					
				}
				
				
				for(int k = j+1 ; k < A.length ; k++){
					
					if(k-1 == j){
						rightSum = 0;
					} else {						
						rightSum = sumArray[k-1] - sumArray[j];						
					}
					
					
					if(leftSum + rightSum > highestSum){
						highestSum = leftSum + rightSum;
					}
				}
				
			}
		}
		
		return highestSum;
	}
}
//https://app.codility.com/demo/results/trainingTKHG47-VYV/