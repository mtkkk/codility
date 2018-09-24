package codility_3;

public class TapeEquilibrium_1 {

	public static void main(String[] args) {
		int[] A = {3,1,2,4,3};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {        
        int lowestSum = 0;
        boolean firstIteration = true;
		
		for(int p = 1 ; p < A.length ; p++ ){
			
			int[] leftArray = new int[p];
			//Assigns left array
			for(int i = 0 ; i < p ; i++ ){
				leftArray[i] = A[i];
			}
			
			int[] rightArray = new int[A.length - p];
			//Assigns right array
			for(int j = p ; j < A.length ; j++ ){
				rightArray[j-p] = A[j];
			}
			
			int currentSum = Math.abs(getSum(leftArray) - getSum(rightArray));
			if(firstIteration){
				lowestSum = currentSum;
				firstIteration = false;
			}
			else if(currentSum < lowestSum && !firstIteration){
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
