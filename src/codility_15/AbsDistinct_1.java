package codility_15;

import java.util.HashSet;
import java.util.Set;

public class AbsDistinct_1 {

	public static void main(String[] args) {
		int[] A = {-5,-3,-1,0,1,3,6};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		int result = 0;
		Set<Integer> distincts = new HashSet<Integer>();
		
		for(int i = 0 ; i < A.length ; i++){
			distincts.add(Math.abs(A[i]));
		}
		
		return distincts.size();
	}
}
//https://app.codility.com/demo/results/trainingBSDCW6-MWW/