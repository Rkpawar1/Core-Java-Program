package com.corejava;

import java.util.Scanner;

public class Last_Character_in_EveryWord {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        System.out.println("Enter a string");
	        String s1 = s.nextLine();
	        char[] c = s1.toCharArray();
	        for (int i = 0; i < c.length; i++) {
	            if (i == c.length - 1) 
	            {
	                System.out.println(s1.charAt(i));
	            }
	            else if (s1.charAt(i + 1) == ' ')
	            {
	                
	                System.out.println(s1.charAt(i));
	               
	                i++;
	            }
	        }

	}

}
