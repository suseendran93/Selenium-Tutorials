package practice;

public class PrimeNumber {

	/*
	 * 0 and 1 are not prime numbers ,2 is the only even prime number 
	 * A prime number should only divisible by itself and 1 
	 * So, if the number is divisible by any of the numbers between range 2 to n-1 it is NOT A PRIME number 
	 * Else it is a PRIME number
	 */

	 static boolean Prime(int n) {

		if (n == 0 || n == 1)//Checking if it is 0 or 1

			return false;

		for (int i = 2; i < n; i++) {//Checking if it is divisible by any number between 2 and n-1
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(Prime(2)) {
			System.out.println("Is a prime number");
		}
		else {
			System.out.println("Not a prime");
		}
	}


}
