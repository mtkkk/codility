package codility_13;

public class Ladder_1 {

	public static void main(String[] args) {
		int[] A = {4,4,5,5,1};
		int[] B = {3,2,4,3,1};
		solution(A, B);
	}
	
	public static int[] solution(int[] A, int[] B) {
		int result[] = new int[A.length];
		
		for(int i = 0 ; i < A.length ; i++){
			int exp = (int) Math.pow(2, B[i]);
			
			result[i] = (fibb(1, A[i]) + fibb(2, A[i])) % exp;
		}
		
		return result;
	}
	
	public static int fibb(int a,int n){
		if(a > n){
			return 0;
		} else if(a == n){
			return 1;
		} else {
			return fibb(a+1,n) + fibb(a+2,n);
		}
	}
}
//https://app.codility.com/demo/results/trainingNACTUD-P7S/