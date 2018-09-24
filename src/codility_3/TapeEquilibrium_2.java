package codility_3;

public class TapeEquilibrium_2 {

	public static void main(String[] args) {
		int[] A = {1,4,5,10,20};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {        
        int leftSum = A[0];        
        int totalSum = getSum(A);
        int lowestSum = Math.abs(leftSum - (Math.abs(leftSum-totalSum)));
		
		for(int p = 1 ; p < A.length-1 ; p++ ){
			leftSum += A[p]; 
			int rightSum = Math.abs(leftSum - totalSum);
			int currentSum = Math.abs(leftSum - rightSum);
			
			if(currentSum < lowestSum){
				lowestSum = currentSum;
			}
			
		}
		
		return lowestSum;
    }
	
	public static int getSum(int[] arr){
		int sum = 0;
		for(int value : arr){
			sum += value;
		}
		return sum;
	}
}
