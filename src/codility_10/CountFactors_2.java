package codility_10;

public class CountFactors_2 {

	public static void main(String[] args) {
		int N = 64;
		System.out.println(solution(N));
	}
	
	public static int solution(int N) {
		int i = 1;
		int j = N;
		int factors = 0;
		
		while(i<=j){
			if(N%i == 0){
				j= N/i;
				if(i==j){
					factors+= 1;
				} else if(i>j) {
					break;
				}
				else {				
					factors += 2;
				}								
			}
			i++;
		}
		return factors;
    }
}
//https://app.codility.com/demo/results/training76V4UA-6XM/