package codility_10;

public class MinPerimeterRectangle_1 {

	public static void main(String[] args) {
		int N = 24;
		System.out.println(solution(N));
	}
	
	public static int solution(int N) {
		int minP = 2 * (N+1);
		int i = 1;
		int j = N;
		
		while(i<=j){
			if(N % i == 0){
				j= N / i;
				int localP = 2 * (i + j);
				
				if(localP < minP){
					minP = localP;
				}
			}
			i++;
		}
		
		return minP;
    }
}
//https://app.codility.com/demo/results/trainingEUY962-UFS/