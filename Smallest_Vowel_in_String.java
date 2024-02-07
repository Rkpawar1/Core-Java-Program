package com.corejava;

import java.util.Scanner;

public class Smallest_Vowel_in_String {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=s.nextLine();
		s1=s1.toLowerCase();
		for(int i=0;i<s1.length();i++)
		{   
			
			if(s1.contains("a"))
			{
				System.out.println("Smallest Vowel:a");
				break;
			}
			else if(s1.contains("e"))
			{
				System.out.println("Smallest Vowel:e");
				break;
			}
			else if(s1.contains("i"))
			{
				System.out.println("Smallest Vowel:i");
				break;
			}
			else if(s1.contains("o"))
			{
				System.out.println("Smallest Vowel:0");
				break;
			}
			else if(s1.contains("u"))
			{
				System.out.println("Smallest Vowel:u");
				break;
			}
		}

	}

}
