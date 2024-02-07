package com.corejava;
class B {
	protected void print() {
		System.out.println("In Protected ");
	}
	private void Print1()
	{
		System.out.println("In Private");
	}
	void print2() {
		System.out.println("In Default");
	}
	public void Print3() {
		System.out.println("In Public");
	}
}
public class Inheritance extends B {

	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Inheritance h=new Inheritance();
		h.print();
		h.print2();
		h.Print3();
		

	}

	
}
