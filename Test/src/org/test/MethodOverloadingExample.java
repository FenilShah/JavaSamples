package org.test;

class MethodOverloading{
	protected void printMe(int a, long b){
		System.out.println("int a is " + a + " long b is " + b);
	}
	
	protected void printMe(long a, int b){
		System.out.println("long a is " + a + " int b is " + b);
	}
	
	protected void printMe(Integer a, Long b){
		System.out.println("Integer a is " + a + " Long b is " + b);
	}
	
	protected void printMe(Long a, Integer b){
		System.out.println("Long a is " + a + " Integer b is " + b);
	}
}

public class MethodOverloadingExample {
	public static void main(String[] args){
		MethodOverloading a = new MethodOverloading();
		
		//The method printMe(int, long) is ambiguous for the type A
		/*a.printMe(5, 10);*/
		
		//Integer a is 5 Long b is 10
		a.printMe(5, 10L); 
		
		//Integer a is 8 Long b is 25
		a.printMe(new Integer(8), new Long(25));
	}
}
