package codility_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

public class OddOccurrencesInArray_3 {

	public static void main(String[] args) {
		int[] A = {9,9,9,9,9,9,9,9,9,9,9,9,9};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		int unpaired = 0;
		Map<Integer,Integer> occ = new HashMap<Integer,Integer>();
		
		for(int i = 0 ; i < A.length ; i++){
			if(occ.get(A[i]) == null){
				occ.put(A[i], 1);
			} else {
				occ.put(A[i], occ.get(A[i]) + 1);
			}
		}
		
		for(Entry e : occ.entrySet()){
			if((int) e.getValue() % 2 != 0){
				unpaired = (int) e.getKey();
			}
		}
		
		return unpaired;
    }

}
//https://app.codility.com/demo/results/trainingT3VDY4-TEJ/