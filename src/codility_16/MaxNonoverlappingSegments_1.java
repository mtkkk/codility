package codility_16;

public class MaxNonoverlappingSegments_1 {

	public static void main(String[] args) {
		int[] A = {1,3,7,9,9};
		int[] B = {5,6,8,9,10};
		System.out.println(solution(A, B));
	}
	
	public static int solution(int[] A, int[] B) {
		
		for(int i = 0 ; i < A.length ; i++){
			int end = B[i];
			int j = i+1;
		}
		
		return 0;
	}
}
