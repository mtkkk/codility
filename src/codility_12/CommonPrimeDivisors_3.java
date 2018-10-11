package codility_12;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CommonPrimeDivisors_3 {

	public static void main(String[] args) {
		int[] A = {15,15,10,9,7};
		int[] B = {60,75,30,5,21};
		System.out.println(solution(A, B, A.length));
	}
	
	//The O (log(a + b)) gcd algorithm,
	public static int gcd(int a, int b)
	{
	    if (a % b == 0){
	        return b;
	    }
	    return gcd(b, a % b);
	}

	public static boolean check(int a, int gcd_ab)
	{
	    //check if all the prime divisors of 'a' can be found
	    //in the prime divisors of gcd(a,b).

	    int rest = a / gcd_ab;
	    
	    //if gcd(a, b) % rest == 0, that means all the prime divisors 
	    //of 'rest' is included in the prime divisors of gcd(a,b).
	    while (gcd_ab % rest != 0){

	        int gcd_tmp = gcd(gcd_ab, rest);
	        
	        //if gcd(a,b) have 1 as the gcd with rest larger,
	        //that means 'a / gcd(a,b)' contains some prime divisor that is not
	        //found in the prime divisors of gcd(a,b).
	        if (gcd_tmp == 1){
	            return false;
	        }
	        
	        rest /= gcd_tmp;
	    }
	    
	    return true;
	}

	public static int solution(int A[], int B[], int Z) 
	{

	    int cnt = 0;
	    
	    int i;
	    for (i = 0; i < Z; i++){
	        int gcd_ab = gcd(A[i], B[i]);
	        if (check(A[i], gcd_ab) && check(B[i], gcd_ab)){
	            cnt++;
	        }
	    }
	    
	    return cnt;
	}

}