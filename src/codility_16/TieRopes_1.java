package codility_16;

public class TieRopes_1 {

	public static void main(String[] args) {
		int[] A = {1,2,3,4,1,1,3};
		int K = 4;
		System.out.println(solution(K, A));
	}
	
	//Greedy Algorithm
	public static int solution(int K, int[] A) {
		int count = 0;
		long localSum = 0;
		
		for(int i = 0 ; i < A.length ; i++){
			localSum += A[i];
			
			if(localSum >= K){
				count++;
				localSum = 0;
			}
		}
		
		return count;
	}
}
//https://app.codility.com/demo/results/trainingVEX7UA-9GD/
