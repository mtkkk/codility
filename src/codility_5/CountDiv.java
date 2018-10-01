package codility_5;

public class CountDiv {

	public static void main(String[] args) {
		int A = 101;
		int B = 123451000;
		int K = 10000;
		System.out.println(solution(A, B, K));
	}
	
	public static int solution(int A, int B, int K) {
		int countDiv = 0;
		
		for(int i = A ; i <= B ; i++ ){
			if(i%K == 0) {
				countDiv++;
			}
		}
		return countDiv;
    }
}

//https://app.codility.com/demo/results/trainingZN2QNF-JMK/