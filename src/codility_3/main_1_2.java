package codility_3;

public class main_1_2 {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,5};
		
		System.out.println(solution(a));
	}

	//Note: Got O(N)
	public static int solution(int[] A){
		
		int n = A.length+1;
		int result = n * (n+1) / 2;
		
		for(int i : A){
			result -= i; 
		}
		
		return result;
	}
}
