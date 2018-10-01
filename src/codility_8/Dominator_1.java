package codility_8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Dominator_1 {

	public static void main(String[] args) {
		int[] A = {3,4,3,2,3,-1,3,3,1};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
        Map<Integer,Integer> counter = new HashMap<Integer,Integer>();
        Map<Integer,Integer> position = new HashMap<Integer,Integer>();
		int dominator = -1;
        
        for(int i = 0 ; i < A.length ; i++){
        	if(counter.get(A[i]) == null){
        		counter.put(A[i], 1);
        		position.put(A[i], i);
        	} else {
        		counter.put(A[i], counter.get(A[i])+1);
        	}        	
        }
        
        for(Entry<Integer,Integer> nOccurrences : counter.entrySet()){
        	if( (nOccurrences.getValue() > dominator) && (nOccurrences.getValue() > A.length/2)){
        		dominator = position.get(nOccurrences.getKey());
        	}
        }
        
		return dominator;
    }
}

//https://app.codility.com/demo/results/training3DS6ZW-6PA/
