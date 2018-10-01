package codility_5;

public class CountDiv_5 {

	public static void main(String[] args) {
		int A = 101;
		int B = 123451000;
		int K = 10000;
		System.out.println(solution(A, B, K));
	}
	
	public static int solution(int A, int B, int K) {
		int countDiv = 0;
		
		if( A%K == 0 ){
			countDiv++;
		}
		
		countDiv += (B/K) - (A/K);
		
		return countDiv;
    }
}
