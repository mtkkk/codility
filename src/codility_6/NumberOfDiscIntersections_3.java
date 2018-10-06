package codility_6;

import java.util.Arrays;

public class NumberOfDiscIntersections_3 {

	public static void main(String[] args) {
		//int[] A = {1,5,2,1,4,0};
		int[] A = {1, 2147483647, 0};		
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		int len = A.length;
		int maxPairs = len * (len - 1) / 2;
		long[] highs = new long[len];
		long[] lows = new long[len];
		
		
		for(int i = 0 ; i < A.length ; i++){
			highs[i] = (long) i+A[i];
			lows[i] = (long) i-A[i];
		}
		
		Arrays.sort(highs);
		Arrays.sort(lows);
			
		int j = 0;
		for(int i = 0 ; i < len ; i++){
			for( ; j < len ; j++){
				
				if(lows[j] > highs[i]){
					maxPairs -= len - j;
					break;
				}
			}
		}
		
		if(maxPairs > 10000000){
			return -1;
		} else {
			return maxPairs;
		}
		
    }
	

}
//https://app.codility.com/demo/results/trainingN3ZK2R-DAT/