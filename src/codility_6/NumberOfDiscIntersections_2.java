package codility_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class NumberOfDiscIntersections_2 {

	public static void main(String[] args) {
		//int[] A = {1,5,2,1,4,0};
		int[] A = {1, 2147483647, 0};		
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		int pairCount = 0;
		
		for(int i = 0 ; i < A.length ; i++){
			for(int j = i+1 ; j <= A.length-1 ; j++){
				if(intersects(i, A[i], j, A[j])){
					pairCount++;
					if(pairCount > 10000000) return -1;
				}
			}
			
		}
				
		return pairCount;
    }
	
	public static boolean intersects(int i, int iRange, int j, int jRange){
		
		if((long) i+iRange >= j-jRange){
			return true;
		}		
		
		return false;
	}
}
//https://app.codility.com/demo/results/trainingYEFMR9-U6D/