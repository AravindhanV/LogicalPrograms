package com.bridgelabz.logicalprograms;

import java.util.*;

public class StopWatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userChoice;
		long startTime = 0;
		long stopTime;
		long timeElapsed;

		while (true) {

			System.out.println("Enter:\n1 - START/STOP\n2 - EXIT\n");
			userChoice = scanner.nextInt();
			switch (userChoice) {
			case 1:
				if(startTime==0) {
				startTime = System.currentTimeMillis();
				System.out.println("Started At: " + startTime + " ms");
				} else {
					stopTime = System.currentTimeMillis();
					System.out.println("Stopped At: " + stopTime + " ms");
					timeElapsed = stopTime - startTime;
					System.out.println("Elapsed Time: " + timeElapsed + " ms");
					
					startTime = 0;
				}
				break;

			case 2:
				System.exit(0);
			}
			
		}
	}
}
