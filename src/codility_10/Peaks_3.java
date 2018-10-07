package codility_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Peaks_3 {
	
	public static void main(String[] args) {
		//int[] A = {1,2,3,4,3,4,1,2,3,4,6,2};
		int[] A = {1,3,2,1};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
		HashSet<Integer> factors = new HashSet<Integer>();
		List<Integer> peaks = new ArrayList<Integer>();
		int n = A.length;
		int maxBlocks = 0;
		
		if(n < 3){
			return 0;
		}
		
		int auxFactor = n;
		for(int i = 1 ; i < A.length ; i++){
			if(i > auxFactor){
				break;
			}
			if(n % i == 0){ //Is factor
				factors.add(i);
				factors.add(n/i);
				auxFactor = n/i;
			}
		}
		
		boolean peakCandidate = false;
		int previousNumber = A[0];
		for(int i = 0 ; i < n ; i++){
			
			if(A[i] > previousNumber){
				peakCandidate = true;
			}
			
			if(peakCandidate){
				if(A[i] < A[i-1]){
					peaks.add(i-1);
					peakCandidate = false;
				}
			}
			
			previousNumber = A[i];
		}
		
		int[] auxPeaks = peaks.stream().mapToInt(Integer::valueOf).toArray();
		for(int factor : factors){						
			boolean hasPeak = false;
			int auxIndex = 0;
			for(int i = 0 ; i < n ; i+= factor){
				
				int localHighestPos = i+factor -1;
				try{
					if(auxPeaks[auxIndex] <= localHighestPos){
						hasPeak = true;
						auxIndex++;
					} else {
						break;
					}
				} catch (Exception ex){
					auxIndex=0;
					hasPeak = false;
					break;
				}
			}
			
			if(hasPeak){
				if(n/factor > maxBlocks){
					maxBlocks = n/factor;
				}
			}
		}
		
		return maxBlocks;
	}
}
//https://app.codility.com/demo/results/trainingE2RQPT-R68/