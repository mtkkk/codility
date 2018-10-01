package codility_8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EquiLeader_2 {

	public static void main(String[] args) {
		//int[] A = {10,1,-1,4,4,4,2,1,1,3,1,1,1,1,1};
		int[] A = {4,3,4,4,4,2};
		//int[] A = {1,2,3,4,5,5,6,7,5,5,5,5,5,6,7,5,5,5,2,3,4,5,5,5,5};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
		Map<Integer,Integer> counters = new HashMap<Integer,Integer>();
		int leader = -1;
		int leaderCount = 0;
		int countEquiLeaders = 0;
		
		for(int i = 0 ; i < A.length ; i++){
			if(counters.get(A[i]) == null){
				counters.put(A[i], 1);
			} else {
				counters.put(A[i], counters.get(A[i])+1);
			}
		}
		
		//Finding out the leader
		for(Entry<Integer,Integer> n : counters.entrySet()){
			if( (n.getValue() > leaderCount) && (n.getValue() > A.length/2) ){
				leader = n.getKey();
			}
		}
		
		for(int i = 0 ; i < A.length ; i++) {
			if(A[i] == leader){
				leaderCount++;
			}
			
			//Array has leader
			if(leaderCount > (i+1)/2){
				int auxLeaderCount = 0;
				//Sweeps the rest of the array
				for(int j = i+1 ; j < A.length ; j++){
					if(leader == A[j]){
						auxLeaderCount++;
					}
				}
				
				//Second array has leader
				if(auxLeaderCount > (A.length - (i+1))/2 ){
					countEquiLeaders++;
				}
			}
		}
		
		return countEquiLeaders;
	}
}
