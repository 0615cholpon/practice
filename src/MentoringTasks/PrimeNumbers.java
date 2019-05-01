package MentoringTasks;

import replit.primeNumbers;

public class PrimeNumbers {
	public static void main(String[] args) {
	primeNum(90);
		
	}
	public static void primeNum(int number) {
		
		for(int i = 0; i <= number; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
	public static boolean isPrime(int number) {
		if(number < 2) {
			return false;
		}
		for(int i = 2; i < number; i++) {
			if(number % 2 == 0) {
				return false;
			}
			
		}
		return true;
	}

}
