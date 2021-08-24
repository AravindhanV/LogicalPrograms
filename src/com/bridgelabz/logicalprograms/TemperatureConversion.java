package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		double inputTemperature;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature:");
		inputTemperature = scanner.nextInt();

		System.out.println("Select Unit of Temperature:\n1. Celsius\n2. Farenheit");
		int choice = scanner.nextInt();
		scanner.close();

		temperatureConversion(inputTemperature, choice);
	}

	public static void temperatureConversion(double temperature, int choice) {
		double result = 0;
		switch (choice) {
		case 1:
			result = (temperature * 9 / 5) + 32;
			System.out.println("The temperature equals " + result + "F");
			break;
		case 2:
			result = (temperature - 32) * 5 / 9;
			System.out.println("The temperature equals " + result + "C");
			break;
		default:
			System.out.println("Invalid Option");
			return;
		}
	}
}
