package org.test;
public class StringPoolExample 
{
	/*
	 * 
	 * The string pool allows string constants to be reused.
	 * Which is possible because strings in Java are immutable. 
	 * If you repeat the same string constant all over the place in your Java code, you can actually have only one copy of that string in your system, which is one of the advantages of this mechanism.
	 * 
	 * When you use String s = "string constant"; you get the copy that is in the string pool. 
	 * However, when you do String s = new String("string constant"); you force a copy to be allocated.
	 * 
	 */
    public static void main(String[]args)throws Exception 
    {
        
        String s1= "Hi";
        String s2= "Hi";
        String s3= new String("Hi");
        String s4= new String("Hi");
        
        System.out.println(s1 == s2);
        
        System.out.println(s1 == s3);
        
        System.out.println(s3 == s4);
    } 
}


