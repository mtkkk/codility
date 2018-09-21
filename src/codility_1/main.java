package codility_1;

public class main {

	public static void main(String[] args) {
		//int number = 1041;
		//int number = 1376796946; //got 2 expected 5
		//int number = 805306373; //got 1 expected 25
		int number = 1610612737; //got 0 expected 28
		int gap = solution(number);
		System.out.println("Binary Gap: " + gap);
	}
	
	static int solution(int N){
		String binary = Integer.toBinaryString(N);
		int gap = 0 , maximumGap = 0;				
		boolean activeGap = false;
		
		for(char ch : binary.toCharArray()){
			if(ch == '1'){
				//No active gap count, start a new one (this is the first '1')
				if(!activeGap){
					activeGap = true;
					gap = 0;
				}
				//There's already an active gap count , so this 1 must "close" it
				else {
					//activeGap = false;
					if(gap > maximumGap) {
						maximumGap = gap;
					}
					gap = 0;
				}
			} 
			//Reading a '0'
			else {
				//There's an active gap count, increase count
				if(activeGap){
					gap++;
				}
			}
		}
		return maximumGap;
	}
	
	
}
