package codility_1;

public class BinaryGap {

	public static void main(String[] args) {
		int N = 20;
		System.out.println(solution(N));
	}
	
	public static int solution(int N) {
		int biggestGap = 0;
		int auxGap = 0;
		String binary = Integer.toBinaryString(N);
		boolean openGap = false;
		boolean closeGap = false;
		
		for(char c : binary.toCharArray()){
			if(c == '0' && openGap){
				auxGap++;
				closeGap = false;
			} else if(c == '1' && auxGap > 0){
				closeGap = true;
				if(auxGap > biggestGap && closeGap) biggestGap = auxGap;
				auxGap = 0;
			} else if(c == '1'){
				openGap = true;
			}
			
			
		}
		
		return biggestGap;
    }
}
//https://app.codility.com/demo/results/trainingPQBT9Q-J55/
