package org.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Implements java.lang.Comparable and Implements java.util.Comparator

/*
 * Using java.lang.Comparable
 * We can create another class which can get other attributes and compare like below commented class
 * Or we can compare in same class
 * 
 */

/*class C implements Comparable<ComparableExample>{

	@Override
	public int compareTo(ComparableExample o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}*/

//Implements java.lang.Comparable
class D implements Comparable<D>, Comparator<D>{
	int id;
	String name;

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(D o) {
		// TODO Auto-generated method stub
		int i = o.name.compareTo(name);
		
		if(i < 0)
			return 1;
		else if(i == 0)
			return 0;
		else
			return -1;
	}


	// For comparator interface
	@Override
	public int compare(D o1, D o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class ComparableComparatorExample {
	public static void main(String...args){
		List<D> dS = new ArrayList<D>();
		
		D d = new D();
		d.setId(1);
		d.setName("Fenil Shah");
		dS.add(d);
		
		d = new D();
		d.setId(2);
		d.setName("Roger Zemb");
		dS.add(d);
		
		d = new D();
		d.setId(3);
		d.setName("A. P. J. Kalam");
		dS.add(d);
		
		d = new D();
		d.setId(4);
		d.setName("Stephanie Zoper");
		dS.add(d);
		
		System.out.println("Printing array before sorting");
		printList(dS);
		
		//Now sorting a collection using java.util.Collections class
		Collections.sort(dS);
		
		System.out.println("Printing array after sorting");
		printList(dS);
		
		Collections.sort(dS, new Comparator<D>() {
            @Override
            public int compare(D o1, D o2) {
                return o2.name.compareTo(o1.name);
            }
        });
		
		System.out.println("Again comparing using comparator interface in descending order");
		printList(dS);
	}
	
	public static void printList(List<D> dS){
		for(D d : dS){
			System.out.println("Id is " + d.getId() + " and name is " + d.getName());
		}
	}
}
