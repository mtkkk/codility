package codility_5;

import java.util.HashMap;
import java.util.Map;

public class GenomicRangeQuery_1 {

	public static void main(String[] args) {
		int P[] = {2,5,0,6};
		int Q[] = {4,5,6,6};
		String S = "CAGCCTA";
		System.out.println(solution(S, P, Q));
	}
	
	public static int[] solution(String S, int[] P, int[] Q) {
		int[] result = new int[P.length];
		int lastIndex = S.length() - 1;
		
		for(int i = 0 ; i < P.length ; i++){
			String substr;
			if(Q[i] == lastIndex){
				substr = S.substring(P[i]);
			} else {
				substr = S.substring(P[i], Q[i] + 1);
			}			
			
			if(substr.indexOf("A") != -1){
				result[i] = 1;
			} else if(substr.indexOf("C") != -1){
				result[i] = 2;
			} else if(substr.indexOf("G") != -1){
				result[i] = 3;
			} else {
				result[i] = 4;
			}
		}
		
		return result;
    }
}
//https://app.codility.com/demo/results/trainingF6PDCU-DYH/