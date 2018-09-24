package codility_3;

public class Solution_FrgJmp_1 {

	public static void main(String[] args) {
		int x = 16;
		int y = 342;
		int d = 27;
		
		System.out.println(solution(x,y,d));
	}
	
	public static int solution(int X, int Y, int D) {
		
		if(X == Y){
			return 0;
		} else {
			int jumps = (Y-X) / D;
			int remainder = (Y-X) % D; 

			if(remainder != 0){
				jumps++;
			}
			
			return jumps;
		}
    }
}
