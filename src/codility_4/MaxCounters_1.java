package codility_4;

import java.util.Arrays;

public class MaxCounters_1 {

	public static void main(String[] args) {
		int[] A = {3,4,4,6,1,4,4};
		int N = 5;
		System.out.println(solution(N, A));
	}
	
	public static int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int highestCounter = 0;
        
        for(int i = 0 ; i < A.length ; i++){
        	//Fill all counters with highest value
        	if(A[i] > N){
        		Arrays.fill(counters, highestCounter);
        	} else {
        		counters[A[i]-1]++;
        		if(counters[A[i]-1] > highestCounter){
        			highestCounter = counters[A[i]-1];
        		}
        	}
        }
        
        return counters;
    }
}

//https://app.codility.com/demo/results/trainingJTG689-4YS/