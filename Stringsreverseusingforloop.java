package com.corejava;

import java.util.Scanner;

public class Stringsreverseusingforloop {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=s.nextLine();
	   for(int i=s1.length()-1;i>=0;i--)
	   {
		   System.out.print(s1.charAt(i));
	   }

	}

}
