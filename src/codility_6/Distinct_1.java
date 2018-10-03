package codility_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Distinct_1 {

	public static void main(String[] args) {
		int[] A = {};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		Map<Integer,Integer> occ = new HashMap<Integer,Integer>();
		int distinct = 0;
		
		for(int i = 0; i < A.length ; i++){
			if(occ.get(A[i]) == null){
				occ.put(A[i], 1);
				distinct++;
			} else {
				occ.put(A[i], occ.get(A[i]) + 1);
			}
		}
		
		return distinct;
    }
}
//https://app.codility.com/demo/results/trainingRRE2PA-AT4/