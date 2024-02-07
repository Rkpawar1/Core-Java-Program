package com.corejava;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique_Character {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();
        
        Set<Character> uniqueChars = new LinkedHashSet<>();
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!uniqueChars.contains(currentChar)) {
                uniqueChars.add(currentChar);
                System.out.print(currentChar);
            }

        }
	}

}
