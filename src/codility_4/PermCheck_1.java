package codility_4;

import java.util.HashSet;

public class PermCheck_1 {

	public static void main(String[] args) {
		int[] A = {4,1,3,2};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
        HashSet<Integer> occ = new HashSet<Integer>();
		
        for(int i : A){
			if(!occ.add(i)){
				return 0;
			}
		}
		
		for(int j = 1 ; j <= A.length ; j++){
			if(!occ.contains(j)){
				return 0;
			}
		}
		
		return 1;
    }
}
