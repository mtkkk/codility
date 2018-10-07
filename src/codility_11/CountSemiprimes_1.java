package codility_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountSemiprimes_1 {

	public static void main(String[] args) {
		int N = 3000;
		int[] P = {1,4,16};
		int[] Q = {26,10,20};
		System.out.println(solution(N, P, Q));
	}
	
	public static int[] solution(int N, int[] P, int[] Q){
		//finding prime numbers
		boolean[] primeCheck = new boolean[N+1];
		Arrays.fill(primeCheck, true);
		
		for(int i = 2 ; i*i <= N ; i++){
			if(primeCheck[i]){
				for(int j = 2*i ; j <= N ; j+=i){
					primeCheck[j] = false;
				}
			}
		}
		
		//New list of only prime numbers
		List<Integer> primes = new ArrayList<Integer>();
		for(int i = 2 ; i < primeCheck.length ; i++){
			if(primeCheck[i]){
				primes.add(i);
			}
		}
		//transforming into int array
		int[] primesArr = primes.stream().mapToInt(Integer::valueOf).toArray();
		
		Map<Integer,Integer> productCount = new HashMap<Integer,Integer>();
		for(int i = 0 ; i < primesArr.length ; i++){
			for(int j = i ; j < primesArr.length ; j++){
				int product = primesArr[i] * primesArr[j];
				if(productCount.get(product) == null){
					productCount.put(product, 2);
				} else {
					productCount.put(product, productCount.get(product) + 1);
				}
			}
		}
		
		int[] result = new int[P.length];
		
		//Will run the queries
		for(int i = 0 ; i < P.length ; i++){
			result[i] = calculateSemiPrimes(productCount, P[i], Q[i]);
		}
		
		return result;
	}
	
	public static int calculateSemiPrimes(Map<Integer,Integer> count, int start, int end){
		int result = 0;
		
		for(int i = start ; i <= end ; i++){
			if(count.get(i) != null && count.get(i) == 2){
				result++;
			}
		}

		return result;
	}
		
}
//https://app.codility.com/demo/results/trainingMFUA74-CTR/