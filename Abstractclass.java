package com.corejava;

public abstract class Abstractclass {
    public abstract void print();
    protected abstract void print1();
    
    void print2()
    {
    	System.out.println("In Print2");
    }
   
}
class c extends Abstractclass{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("In Class c");
	}

	@Override
	protected void print1() {
		// TODO Auto-generated method stub
		System.out.println("In Class c");
	}
	public static void main(String args[]) {
		c c=new c();
		c.print();
		c.print1();
		c.print2();
	}
	
}