package com.corejava;

import java.util.Scanner;

public class Character_at_odd_Position
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=s.nextLine();
		for (int i=0;i<s1.length();i++)
		{
            if (i%2==0)
            {
                System.out.print(s1.charAt(i) + " ");
            }
		

	    }
	}
}
