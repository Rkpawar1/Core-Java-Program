package com.corejava;
class A{
	public void Print()
	{
		System.out.println("In Public");
	}
	private void Print1() {
		System.out.println("In Private");
		
	}
	void Print2() {
		System.out.println("In Default");
	}
	protected void print3() {
		System.out.println("In Protected");
	}
}
public class Accessmodifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a=new A();
        a.Print();
        a.Print2();
        a.print3();
        
	}

}
