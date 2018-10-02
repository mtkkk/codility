package codility_7;

import java.util.Stack;

public class Nesting_1 {

	public static void main(String[] args) {
		//String S = "(()(())())";
		//String S = "(()(())()))";
		//String S = "(()(())(()()()()()()))";
		String S = "()(()()(((()())(()()))";
		System.out.println(solution(S));
	}
	
	public static int solution(String S) {
		Stack<String> stack = new Stack<String>();
		
		if(S.isEmpty()){
			return 1;
		}
		
		for(int i = 0 ; i < S.length() ; i++){
			String ch = S.substring(i, i+1);
			
			if(ch.equals("(")){
				stack.push(ch);
			} else {
				if(stack.isEmpty()){
					return 0;
				}
				
				if(stack.peek().equals("(")){
					stack.pop();
				} else {
					return 0;
				}
			}
		}
		
		if(!stack.isEmpty()){
			return 0;
		}
		
		return 1;
	}
}
//https://app.codility.com/demo/results/trainingSZEP32-8TC/