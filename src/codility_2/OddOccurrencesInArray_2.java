package codility_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OddOccurrencesInArray_2 {

	public static void main(String[] args) {
		int[] A = {9,3,9,3,9,7,9,7,42,420,420};
		System.out.println(solution(A));
		
	}
	
	public static int solution(int[] A) {
		Map<Integer,Integer> occurrences = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < A.length ; i++){
			if(occurrences.get(A[i]) == null){
				occurrences.put(A[i], 1);
			} else {
				occurrences.put(A[i], occurrences.get(A[i])+1);
			}
			
		}
		
		for(Entry<Integer, Integer> entry : occurrences.entrySet()){
			if((entry.getValue() % 2) != 0){
				return entry.getKey();
			}
		}
		
		return 0;
    }
}
