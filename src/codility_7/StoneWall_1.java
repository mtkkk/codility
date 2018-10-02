package codility_7;

import java.util.Stack;

public class StoneWall_1 {

	public static void main(String[] args) {
		//int[] H = {8,8,5,7,9,8,7,4,8};
		//int[] H = {6,4,3,2,2,4,4,7,8};
		int[] H = {500000,450000,400000,700000,400000,800000,400000,350000,10,5,4,3,2,1};
		System.out.println(solution(H));
	}
	
	public static int solution(int[] H) {
		Stack<Integer> bigBase = new Stack<Integer>();
		int previousHeight = H[0];
		int blocks = 1;
		int baseBlock = H[0];
		bigBase.push(H[0]);
		
		for(int i = 1 ; i < H.length ; i++){
			if(H[i] == previousHeight){ //Same
				continue;
			} else if(H[i] < previousHeight){ //Lower
				
				if(H[i] < bigBase.peek()){ //Lower than previous big base block					
					while(!bigBase.isEmpty() && bigBase.peek() > H[i]){
						bigBase.pop();
					}
					
					if(bigBase.isEmpty() || H[i] != bigBase.peek()){
						blocks++;
						bigBase.push(H[i]);
					}										
				} 

			} else { //Higher
				bigBase.push(H[i]);
				blocks++;
			}
			previousHeight = H[i];
		}
		return blocks;
    }
}
//https://app.codility.com/demo/results/trainingMYNHMY-DD2/