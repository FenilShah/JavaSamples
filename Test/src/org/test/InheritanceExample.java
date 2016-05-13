package org.test;

class A{
	protected void printMe(){
		System.out.println("Class A");
	}
	
	// Duplicate method printMe() in type A
	/*protected String printMe(){
		return "Class A";
	}*/
}

class B extends A{
	
	// Below is not valid, Reason - Cannot reduce the visibility of the inherited method from InheritanceExample.A
	/*private void printMe(){
		System.out.println("Class B");
	}*/
	
	public void printMe(){
		System.out.println("Class B");
	}
}

public class InheritanceExample {
	
	public static void main(String[] args){
		A a1 = new A();
		
		//Will Print Class A
		a1.printMe();
		
		A a2 = new B();
		
		//Will Print Class B
		a2.printMe();
		
		// Type mismatch: cannot convert from A to B
		/*B b = new A();*/
		
	}
}
