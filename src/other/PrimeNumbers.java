package other;

import java.util.Arrays;

public class PrimeNumbers {

	public static void main(String[] args) {
		int N = 50;
		printPrimeNumbers(N);
	}
	
	//Sieve of Eratosthenes
	public static void printPrimeNumbers(int N){
	
		boolean primeCheck[] = new boolean[N+1];
		Arrays.fill(primeCheck, true);
		
		//Will look for all multiples of 2,3,5...N
		//Will skip numbers that have already been marked as not being prime (such as 4, 6, etc)
		for(int i = 2 ; i*i <= N ; i++){
			if(primeCheck[i]){ //Checks if hasnt been marked
				for(int j = i*2 ; j <= N ; j += i){
					primeCheck[j] = false;
				}
			}
			
		}
		
		//Prints all the numbers
		for(int i = 2 ; i <= N ; i++){
			if(primeCheck[i]){
				System.out.print(i + " ");
			}
		}
	}
}
