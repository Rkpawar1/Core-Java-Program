package com.corejava;
import java.util.*;
public class Ifelse {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=s.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Even Number");
		
		}
		else {
			System.out.println("Odd Number");
		}
	}

}
