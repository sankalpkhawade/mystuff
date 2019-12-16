package com.cts.oops;

interface Parent1{
	
	void parentInfo1();
}

interface Parent2{
	
	void parentInfo2();
}
// Fully abstract class (interface) -------------->
class Child implements Parent1,Parent2{
	
	public void parentInfo1(){
		System.out.println("Parent Info1");
	}
	public void parentInfo2(){
		System.out.println("Parent Info2");
	}
}

public class TestInterface {

	public static void main(String[] args) {
		

		Child c=new Child();
		c.parentInfo1();
		c.parentInfo2();
		
		Parent1 p1=new Parent1(){
			//Without anonymous we cannot call method in interface
			public void parentInfo1(){
				System.out.println("Anonymous for Parent1");
			}
		};
		p1.parentInfo1();
		
		Parent2 p2=new Parent2(){
			
			public void parentInfo2(){
				System.out.println("Anonymous for Parent2");
			}
		};
		p2.parentInfo2();
	}

}
