package codility_4;

public class FrogRiverOne_1 {

	public static void main(String[] args) {
		int[] A = {1,3,1,4,2,3,5,4};
		int X = 5;
		System.out.println(solution(X, A));
	}
	
	public static int solution(int X, int[] A) {
		int[] path = new int[X+1];
		int earliestTime = 0;
		
		for(int i = 0; i < A.length ; i++){
			if(i==0){ //First leaf
				path[A[i]] = -1;
			} else if(path[A[i]] == 0){ //Leaf hasnt fallen in this position yet
				path[A[i]] = i;
			}			
		}
		
		for(int j = 1 ; j < path.length ; j++){
			if(path[j] == 0){ //Incomplete path
				return -1;
			} else {
				if(path[j] > earliestTime){
					earliestTime = path[j];
				}
			}
		}
		
		return earliestTime;
    }
}
