package com.bridgelabz.logicalprograms;

import java.util.*;

public class CouponNumbers {
	public static int generateNumber(int numberOfCoupons) {
		return (int) Math.floor(Math.random() * numberOfCoupons) + 1;
	}

	public static void generateDistinctCoupons(int numberOfCoupons) {
		HashSet<Integer> couponCodes = new HashSet<>();
		int totalGenerations=0;

		while (couponCodes.size() != numberOfCoupons) {
			int randomNumber = generateNumber(numberOfCoupons);
			totalGenerations++;
			couponCodes.add(randomNumber);
		}
		
		System.out.println("The total numbers generated are : " + totalGenerations);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numberOfCoupons;
		System.out.println("Enter the number of coupons needed:");
		numberOfCoupons = scanner.nextInt();
		scanner.close();
		generateDistinctCoupons(numberOfCoupons);
	}
}
