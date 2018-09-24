package other;

import java.util.Arrays;

public class CyclicPrimeNumbers {

	public static void main(String[] args) {
		int N = 100;
		printCircularPrimeNumbers(N);
	}
	
	//Sieve of Eratosthenes
	public static void printCircularPrimeNumbers(int N){
	
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
				
				int rotatedPrime = i;
				rotatedPrime = Rotate(rotatedPrime);
				
				//Will make rotations until its back to the prime number
				while(rotatedPrime != i){
					if(primeCheck[rotatedPrime]){
						rotatedPrime = Rotate(rotatedPrime);
					} else {
						break;
					}
				}
				
				if(rotatedPrime == i){
					System.out.print(i + " ");
				}
				
			}
		}
	}
	
	// Rotate function to right rotate the number 
    static int Rotate(int n) 
    { 
        int rem = n % 10; // find unit place number 
        rem *= Math.pow(10, countDigits(n)); // to put unit place 
        // number as first digit. 
        n /= 10; // remove unit digit 
        n += rem; // add first digit to rest 
        return n; 
    } 		

    // Function to find total number of digits 
    static int countDigits(int n) 
    { 
        int digit = 0; 
        while ((n /= 10) > 0) 
            digit++; 
        return digit; 
    } 
}
