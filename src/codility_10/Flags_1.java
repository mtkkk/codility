package codility_10;

import java.util.HashSet;

public class Flags_1 {

	public static void main(String[] args) {
		//int[] A = {1,5,3,4,3,4,1,2,3,4,6,2};
		int[] A = {2,3,2};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
		int previous = 0;
		boolean peakCandidate = false;
		HashSet<Integer> peaks = new HashSet<Integer>();
		
		for(int i = 0; i < A.length ; i++){			
			if(peakCandidate){
				if(A[i] < previous){
					peaks.add(i-1);
					peakCandidate = false;
				}
			}
			
			if(A[i] > previous && i!=0){
				peakCandidate = true;
			} else {
				peakCandidate = false;
			}
							
			previous = A[i];
		}
		
		int k = peaks.size();
		int previousPeakPos = 0;
		int finalPeakCount = 0;
		
		for(int peak : peaks){
			if(previousPeakPos == 0){
				previousPeakPos = peak;
			} else if(Math.abs(peak-previousPeakPos) >= k){
				if(finalPeakCount == 0){
					finalPeakCount += 2; 
				} else {
					finalPeakCount += 1;
				}
			}
			
			
		}
		
		return finalPeakCount;
	}
}
//https://app.codility.com/demo/results/training73MFX9-7XT/