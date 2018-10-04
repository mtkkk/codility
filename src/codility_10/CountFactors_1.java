package codility_10;

public class CountFactors_1 {

	public static void main(String[] args) {
		int N = 16;
		System.out.println(solution(N));
	}
	
	public static int solution(int N) {
		int i = 1;
		int j = N;
		int factors = 0;
		
		while(i<j){
			if(N%i == 0){
				factors += 2;
				j= N/i;
			}
			i++;
		}
		return factors;
    }
}
//https://app.codility.com/demo/results/trainingP82QGR-CXP/