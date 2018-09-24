package codility_5;

import java.util.HashSet;

public class PassingCars_2 {

	public static void main(String[] args) {
		int[] A = {0,1,0,1,1};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
		
		HashSet<Integer> zeroes = new HashSet<Integer>();
		HashSet<Integer> ones = new HashSet<Integer>();
		int pairs = 0;
		
		for(int i = 0 ; i < A.length ; i++){
			if(A[i] == 0){
				//P
				zeroes.add(i);
			} else {
				//Q
				ones.add(i);
			}
		}
		
		for(int p : zeroes){
			for(int q: ones){
				if(q > p){
					pairs++;
				}
			}
		}
		
		return pairs;
	}
}
