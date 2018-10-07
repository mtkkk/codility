package codility_10;

import java.util.HashSet;

public class Peaks_2 {
	
	public static void main(String[] args) {
		int[] A = {1,2,3,4,3,4,1,2,3,4,6,2};
		//int[] A = {1,3,2,1};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
		HashSet<Integer> factors = new HashSet<Integer>();
		HashSet<Integer> peaks = new HashSet<Integer>();
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
		
		for(int factor : factors){
			HashSet<Integer> auxPeaks = new HashSet<Integer>(peaks);
			boolean hasPeak = false;
			for(int i = 0 ; i < n ; i+= factor){
				
				int localHighestPos = i+factor -1;
				try{
					int peak = auxPeaks.stream().filter(x -> x <= localHighestPos).findFirst().get();
					auxPeaks.remove(peak); //Peak is contained
					hasPeak = true;
				} catch (Exception ex){
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
//https://app.codility.com/demo/results/trainingYU5CHK-5G3/