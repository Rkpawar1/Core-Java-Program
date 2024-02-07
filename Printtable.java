package com.corejava;
import java.util.*;
public class Printtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Number:");
        int a=s.nextInt(); 
        for(int i=1;i<=10;i++) {
        	System.out.println(a*i);
        }
	}

}
