package other;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 12;
		solution(a);
	}
	
	public static void solution(int a){
		System.out.print("0, 1, 1");
		a -= 3;
		int prev = 1;
		int prev2 = 1;
		
		for(int i = 0 ; i < a ; i++){
			int sum = prev + prev2;
			System.out.print(", " + sum);			
			prev2 = prev;
			prev = sum;
		}
	}
}
