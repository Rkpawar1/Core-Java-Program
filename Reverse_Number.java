package com.corejava;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter an integer:");
	        int number = scanner.nextInt();
	        int reversedNumber = reverseNumber(number);
	        System.out.println("Reversed number: " + reversedNumber);
	    }

	    public static int reverseNumber(int number) {
	        int sign = 1;
	        if (number < 0) {
	            sign = -1;
	            number = Math.abs(number);
	        }

	        int reversedNumber = 0;
	        while (number != 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }

	        return reversedNumber * sign;

	}

}
