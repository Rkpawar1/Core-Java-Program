package com.corejava;

public class implementinterface implements Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         implementinterface m=new implementinterface();
         Interface i=new implementinterface();
         i.print3();
         
         m.print();
         m.print2();
         System.out.println(Interface.print1());
        
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Inside Print");
		
	}

	@Override
	public void print2() {
		// TODO Auto-generated method stub
		System.out.println("Inside Print1");
	}

}
