package com.corejava;

public interface Interface {
 public void print();
 abstract void print2();
 default void print3() {
	System.out.println("Inside of Default method of interface");
}
  static  int print1() {
	  return 1;
 }
 
}
