package com.cts.oops;

class GParent{
	
	String firstName="James";
	String lastName="Gosling";
	String surName="Java";
	
	public void gparentInfo(){
		
		System.out.println("\n-------GParent Info-------");
		System.out.println(firstName+"\t"+lastName+"\t"+surName);
	}
}

class Parent extends GParent{
	
	String firstName="Gavin";
	String lastName="King";
	
	public void parentInfo(){
		
		//System.out.println("-------Parent Info-------");
		super.gparentInfo();
		//System.out.println(super.firstName+"\t"+super.lastName+"\t"+surName);
		System.out.println(firstName+"\t"+lastName+"\t"+surName);
	}
}

class Child1 extends Parent{
	
	String firstName="Rod";
	String lastName="Johnson";
	
	public void child1Info(){
		
		//System.out.println("-------Child1 Info-------");
		super.parentInfo();
		//System.out.println(super.firstName+"\t"+super.lastName+"\t"+surName);
		System.out.println(firstName+"\t"+lastName+"\t"+surName);
	}
}

class Child2 extends Parent{
	
	String firstName="EF";
	String lastName="Codd";
	
	public void child2Info(){
		
		//System.out.println("-------Child2 Info-------");
		super.parentInfo();
		//System.out.println(super.firstName+"\t"+super.lastName+"\t"+surName);
		System.out.println(firstName+"\t"+lastName+"\t"+surName);
	}
}

public class TestInheritance {

	public static void main(String[] args) {
		
		Child1 c1=new Child1();
		//c1.gparentInfo();
		//c1.parentInfo();
		c1.child1Info();
		
		Child2 c2=new Child2();
		//c2.gparentInfo();
		//c2.parentInfo();
		c2.child2Info();
	}

}
