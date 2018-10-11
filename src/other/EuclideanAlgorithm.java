package other;

public class EuclideanAlgorithm {

	public static void main(String[] args) {
		int A = 3;
		int B = 10;
		System.out.println(solution(A, B));
	}
	
	public static int solution(int A, int B){
		
		//Greatest common divisor
		//Euclidean Algorithm
		int gcd = gcd(A,B);
		int lcm = A*B / gcd(A,B);
		
		return gcd;
	}
	
	public static int gcd(int a, int b){
		if(a % b == 0){
			return b;
		} else {
			return gcd(b, a % b);
		}
	}
}
