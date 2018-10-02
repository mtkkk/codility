package codility_7;

import java.util.Stack;

public class Brackets_1 {

	public static void main(String[] args) {
		String S = "{[()()]}";
		System.out.println(solution(S));
	}
	
	public static int solution(String S) {
		Stack<String> stack = new Stack<String>();
		String openingChars = "{[(";
		String closingChars = "}])";
				
		if(S.isEmpty()){
			return 1;
		} else {
			for(int i = 0 ; i < S.length() ; i++){
				String ch = S.substring(i, i+1);
				
				//Verify if its an opening or closing character				
				if(openingChars.indexOf(ch) != -1){ //Opening
					stack.push(ch);
				} else { //Closing
					int index = closingChars.indexOf(ch);
					if(stack.peek().equals(openingChars.substring(index, index+1))){
						stack.pop();
					} else { //If the top element is not the openingChar for this closingChar then its not nested
						return 0;
					}
				}
			}
		}
		
		if(stack.isEmpty()){
			return 1;
		}
		
		return 0;
	}
}
//https://app.codility.com/demo/results/trainingG8DH7B-A35/