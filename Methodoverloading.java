package com.corejava;

public class Methodoverloading {
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum: "+c);
	}
public void sum(int a,int b,int c)
{
	int d=a+b+c;
	System.out.println("Sum: "+d);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Methodoverloading m=new Methodoverloading();
       m.sum(10, 20);
       m.sum(10, 20, 30);
	}

}
