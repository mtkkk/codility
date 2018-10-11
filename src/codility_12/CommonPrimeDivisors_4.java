package codility_12;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CommonPrimeDivisors_4 {

	public static void main(String[] args) {
		int[] A = {15,15,10,9,7};
		int[] B = {60,75,30,5,21};
		System.out.println(solution(A, B));
	}
	
	//The O (log(a + b)) gcd algorithm,
	public static int gcd(int a, int b)
	{
	    if (a % b == 0){
	        return b;
	    }
	    return gcd(b, a % b);
	}

	
	public static int removeCommonPrimeDivisors(int x, int y){
		while (x != 1){
			int gcd_value = gcd(x,y);
			if(gcd_value == 1){
				break;
			}
			x /= gcd_value;
		}
		
		return x;
	}
	
	public static boolean hasSamePrimeDivisors(int x, int y) {
		
		int gcd_value = gcd(x,y);
		
		x = removeCommonPrimeDivisors(x, gcd_value);
		if(x != 1){
			return false;
		}
		y = removeCommonPrimeDivisors(y, gcd_value);
		
		return y==1;
	}
	    
	public static int solution(int[] A, int[] B){
		int count = 0;
	    for(int i = 0 ; i < A.length ; i++){
	    	if(hasSamePrimeDivisors(A[i],B[i])){
	    		count += 1;
	    	}   
	    }
	        
	    return count;
	}
	    

}