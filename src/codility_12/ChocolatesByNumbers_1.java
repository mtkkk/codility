package codility_12;

import java.util.HashMap;

public class ChocolatesByNumbers_1 {

	public static void main(String[] args) {
		int N = 1000000000;
		int M = 1;
		System.out.println(solution(N, M));
	}
	
	public static int solution(int N, int M) {
		HashMap<Integer,Boolean> chocolates = new HashMap<Integer,Boolean>();
		int cEaten = 1;
		chocolates.put(0, true);
		
		int next = M % N;
		if(next > N) { 
			return cEaten;
		} else {
			while(chocolates.get(next) == null){
				cEaten++;
				chocolates.put(next, true);
				next = (next + M) % N;
			}
		}
		
		return cEaten;
	}
}
//https://app.codility.com/demo/results/trainingYS67NX-RJ2/