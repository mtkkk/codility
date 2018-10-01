package codility_5;

public class CountDiv_2 {

	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		int K = 11;
		System.out.println(solution(A, B, K));
	}
	
	public static int solution(int A, int B, int K) {
		int countDiv = 0;
				
		if(A%K == 0){
			countDiv++;
		}
		
		int diff = B - A;
		
		countDiv += diff/K;
		
		return countDiv;
    }
}

//https://app.codility.com/demo/results/trainingCQ27CM-3XG/