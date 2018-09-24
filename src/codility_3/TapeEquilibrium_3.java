package codility_3;

public class TapeEquilibrium_3 {

	public static void main(String[] args) {
		//int[] A = {-10,-5,-3,-4,-5};
		//int[] A = {1,4,5,10,20};
		int[] A = {3,1,2,4,3};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {        
        int leftSum = A[0];        
        int totalSum = getSum(A);
        int firstRightSum = totalSum - leftSum;
        int lowestSum = Math.abs(leftSum - firstRightSum);
		
		for(int p = 1 ; p < A.length-1 ; p++ ){
			leftSum += A[p]; 
			int rightSum = totalSum - leftSum;
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
