package com.corejava;

import java.util.Scanner;

public class Space_Character_Count {

	public static void main(String[] args) {
		int SpaceCount=0;
		int CharacterCount=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s1=s.nextLine();
		s1=s1.toLowerCase();
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
			{
				CharacterCount++;
				
			}
			else if(s1.charAt(i)==' ')
			{
				SpaceCount++;
			}
		}
        System.out.println("Space Count:"+SpaceCount);
        System.out.println("Character Count:"+CharacterCount);
        
	}

}
