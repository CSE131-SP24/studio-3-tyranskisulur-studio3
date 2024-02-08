package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What number would you like to find the prime numbers for?");
		int n = in.nextInt();
		
		boolean[] boolArr = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			boolArr[i] = true; 
		}
		
		for(int i = 2; i < Math.sqrt(n); i++) {
			 if (boolArr[i] == true) {
				 for(int j = (i*i); j < n; j = j+i) {
					 
					 boolArr[j] = false; 
				 }
			
			 }
			
		}
		for(int k = 2; k < n; k++) {
			if (boolArr[k] == true) {
				System.out.println(k); 
			}
			
		}
	}

}
