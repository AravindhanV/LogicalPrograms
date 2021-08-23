package com.bridgelabz.logicalprograms;

public class FibbonaciSeries {
	public static void main(String[] args) {
		int fibonacciLimit = 15;

		int previousNumber = 0;
		int currentNumber = 1;
		System.out.print(previousNumber + ", " + currentNumber);

		for (int index = 2; index <= fibonacciLimit; index++) {
			int nextNumber = previousNumber + currentNumber;
			previousNumber = currentNumber;
			currentNumber = nextNumber;
			System.out.print(", " + nextNumber);
		}
	}
}
