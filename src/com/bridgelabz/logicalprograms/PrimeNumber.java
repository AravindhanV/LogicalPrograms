package com.bridgelabz.logicalprograms;

import java.util.*;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int number = scanner.nextInt();
		scanner.close();

		if (number == 1 || number == 0) {
			System.err.println("0 and 1 are neither prime nor composite");
			return;
		}

		for (int index = 2; index * index <= number; index++) {
			if (number % index == 0) {
				System.out.println(number + " is not a Prime Number");
				return;
			}
		}

		System.out.println(number + " is a Prime Number");
	}
}
