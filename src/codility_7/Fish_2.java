package codility_7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Fish_2 {

	public static void main(String[] args) {
		int[] A = {4,3,2,1,5};
		//int[] A = {4,6,2,1,5,3};
		//int[] A = {4,6,2,1,5,3,7};
		//int[] A = {1,2,3,4,5,6,7};
		int[] B = {0,1,0,0,0};
		//int[] B = {0,1,0,0,0,1};
		//int[] B = {0,1,0,0,0,1,0};
		//int[] B = {1,1,1,1,1,1,0};
		System.out.println(solution(A, B));
	}
	
	public static int solution(int[] A, int[] B){
		Map<Integer,String> status = new HashMap<Integer,String>();
		int aliveFish = 0;
		
		for(int i = 0 ; i < B.length ; i++ ){
			if(status.get(i) == null){
				status.put(i, "alive");
			}
			
			//Fish is swimming upstream and alive
			if(B[i] == 0 && status.get(i).indexOf("alive") != -1){
				//aliveFish++;
			} 
			//Fish is swimming downstream and alive
			else if(B[i] == 1 && status.get(i).indexOf("alive") != -1){
				int j = i+1;
				
				//End of array and last fish is alive and swimming downstream
				if(j>=B.length){
					//aliveFish++;
					continue;
				}
				
				//Scans the rest of the array until fish P is eaten or finds another fish Q swimming downstream
				while(B[j] != 1){
					if(A[i] > A[j]){ //P fish is bigger, eats Q
						status.put(j, "dead");
						j++;
					} else { //Q fish is bigger, eats P						
						status.put(i, "dead");
						
						int k = i-1;
						
						//Start scanning they array from right to left in search for fishes swimming downstream that are smaller
						while(k>= 0 && B[k] != 0){
							if(A[j] > A[k] && status.get(k).indexOf("alive") != -1){ //Q fish is bigger, eats P
								status.put(k, "dead");
								k--;
							} else { //P fish is bigger, eats Q
								status.put(j, "dead");
								break;
							}
						}
						
						break;
					}
				}
				
//				if(status.get(i).indexOf("alive") != -1){
//					aliveFish++;
//				}
			}
		}
		
		for(Entry<Integer,String> entry : status.entrySet()){
			if(entry.getValue().indexOf("alive") != -1){
				aliveFish++;
			}
		}
		return aliveFish;
	}
}
//https://app.codility.com/demo/results/trainingDSWZQA-37X/