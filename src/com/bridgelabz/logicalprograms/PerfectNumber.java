package com.bridgelabz.logicalprograms;

import java.util.*;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		
		int sumOfDivisors = 0;
		int number = scanner.nextInt();

		for (int index = 2; index * index <= number; index++) {
			if (number % index == 0) {
				sumOfDivisors += (index + (number/index));
			}
		}
		sumOfDivisors+=1;
		
		if (sumOfDivisors == number) {
			System.out.println(number + " is a perfect Number");
		} else {
			System.out.println(number + " is not a Perfect Number");
		}

	}
}
