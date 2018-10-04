package codility_6;

public class Triangle_1 {

	public static void main(String[] args) {
		//int A[] = {10,2,5,1,8,20};
		int A[] = {2147483647,2147483647,2147483647};
		
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		
		for(int p = 0 ; p < A.length-2 ; p++){
			for(int q = p+1 ; q < A.length-1 ; q++)	{
				for(int r = q+1 ; r < A.length ; r++){
					long sum;
					sum = (long)A[p] + A[q];
					if(sum > A[r]){
						sum = (long)A[q] + A[r]; 
						if(sum > A[p]){
							sum = (long)A[r] + A[p]; 
							if(sum > A[q]){
								return 1;
							}
						}
					}
				}
			}
		}
		
		return 0;
    }
}
//https://app.codility.com/demo/results/trainingHF4GVG-UKE/