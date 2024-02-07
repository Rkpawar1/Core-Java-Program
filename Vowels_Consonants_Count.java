package com.corejava;

import java.util.Scanner;

public class Vowels_Consonants_Count {

	public static void main(String[] args) {
		int VowelCount=0;
		int Consonantscount=0;
		int digit=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=s.nextLine();
		String s2= s1.toLowerCase();
        for(int i=0;i<s2.length();i++) {
        if(s2.charAt(i)>'a' && s2.charAt(i)<'z'){
        	
          if(s2.charAt(i)=='a'|| s2.charAt(i)=='e' || s2.charAt(i)=='i'||s2.charAt(i)=='0'||s2.charAt(i)=='u')
          {
        	  VowelCount++;
          }
          else {
        	  Consonantscount++;
          }
          
        }
        if(s2.charAt(i)>='0' && s2.charAt(i)<='9') {
      	  ++digit;
        }
        }
        System.out.println("Vowels Count:"+VowelCount);
        System.out.println("Vowels Count:"+Consonantscount);
        System.out.println("digit Count:"+digit);
	}

}
