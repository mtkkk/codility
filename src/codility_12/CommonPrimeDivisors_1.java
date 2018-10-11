package codility_12;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CommonPrimeDivisors_1 {

	public static void main(String[] args) {
		int[] A = {1,15,10,9,7};
		int[] B = {1,75,30,5,21};
		System.out.println(solution(A, B));
	}
	
	public static int solution(int[] A, int[] B) {
		
		int count = 0;
		
		for(int i = 0 ; i < A.length ; i++){	
			HashSet<Integer> divisorsA = new HashSet<Integer>();
			int higher = 0;
			boolean cleanPair = true;
			
			if(A[i] > B[i]){
				higher = A[i];
			} else {
				higher = B[i];
			}				
			
			//Find out the factors
			int index = 2;
			int k = higher;
			while(index <= k){
				if(higher % index == 0){
					divisorsA.add(index);
					k = higher / index;
				}
				index++;
			}
			
			//Which of these numbers are factors of the other array
			int otherNumber = 0;
			if(higher == A[i]){
				otherNumber = B[i];
			} else {
				otherNumber = A[i];
			}
			HashSet<Integer> aux = new HashSet<Integer>(divisorsA);
			for(int factor : aux){
				if( !(otherNumber % factor == 0) ){
					//not a factor
					if(isPrime(factor)){
						cleanPair = false;
						break;
					}
					divisorsA.remove(factor);								
				}
			}
			
			//Now that there are only factors of both , check if they are prime
			if(!cleanPair){
				continue;
			}
			
			aux = new HashSet<Integer>(divisorsA);
			for(int factor : aux){
				if(!isPrime(factor)){
					divisorsA.remove(factor);
				}
			}
			
			if(!divisorsA.isEmpty()){
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean isPrime(int n) {
		if(n == 2){
			return true;
		} else if(n == 3){
			return true;
		} else if(n % 2 == 0){
			return false;
		} else if(n % 3 == 0){
			return false;
		}
		
		int i = 5;
		int w = 2;
		
		while(i*i <= n){
			if(n % i == 0){
				return false;
			}
			i+= w;
			w = 6 - w;
		}
		
		return true;
	}
}
//https://app.codility.com/demo/results/trainingKJYQQY-ZMC/