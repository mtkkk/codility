package codility_3;

public class CyclicRotation {

	public static void main(String[] args) {
		int[] A = {3,8,9,7,6};
		int K = 3;
		System.out.println(solution(A, K));
	}
	
	public static int[] solution(int[] A, int K) {
		
		//Since there are only 100 elements, O(m*n) is fine
		for(int i = 0 ; i < K ; i++){
			A = shift(A);
		}
		
		return A;
    }
	
	public static int[] shift(int[] a){
		int[] shifted = a.clone();
		
		for(int i = 0 ; i < a.length ; i++){
			if(i == 0){
				shifted[i] = a[a.length-1];
			} else {
				shifted[i] = a[i-1];
			}
		}
		
		return shifted;
	}
}
//https://app.codility.com/demo/results/trainingRJDRVP-38T/