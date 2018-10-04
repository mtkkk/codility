package codility_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaxProductOfThree_1 {

	public static void main(String[] args) {
		int[] A = {-3,1,2,-2,5,6};
		//int[] A = {-3,1,2,25};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		int ans = A[0] * A[1] * A[2];
		int product;
		
		for(int p = 0 ; p < A.length-2 ; p++){
			for(int q = p+1 ; q < A.length-1 ; q++){
				for(int r = q+1 ; r < A.length ; r++){
					product = A[p] * A[q] * A[r];
					if(product > ans){
						ans = product;
					}
				}
			}
		}
		
		return ans;
	}
}
//https://app.codility.com/demo/results/trainingT9GRHV-J3N/