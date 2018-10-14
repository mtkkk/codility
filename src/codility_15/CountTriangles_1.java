package codility_15;

public class CountTriangles_1 {

	public static void main(String[] args) {
		int[] A = {10,2,5,1,8,12};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		int result = 0;
		
		for(int i = 0; i < A.length-2 ; i++){
			for(int j = i+1 ; j < A.length-1 ; j++){
				for(int k = j+1 ; k < A.length ; k++){
					if(isTriangular(A[i], A[j], A[k])){
						result++;
					}
				}
			}
		}
		
		return result;
	}
	
	public static boolean isTriangular(int p, int q, int r){
		if(p+q > r && q+r > p && r+p >q){
			return true;
		} else {
			return false;
		}
	}
}
//https://app.codility.com/demo/results/trainingKSGTFA-B6N/