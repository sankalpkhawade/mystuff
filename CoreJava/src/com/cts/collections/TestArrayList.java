package com.cts.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

class Employee{
	
	public void employeeInfo(){
		ArrayList<Object> arrayList=new ArrayList<>();
		arrayList.add(0, 1122);
		arrayList.add(1, "James");
		arrayList.add(2, 80000.00);
		arrayList.add(3, "james@gmail.com");
		arrayList.add(4, 1122);
		arrayList.add(5, null);
		System.out.println("ArrayList = "+arrayList);
		//Collections.synchronizedList(arrayList);
		
		Object o=arrayList.get(1);
		System.out.println("Get the element from ArrayList at particular position : "+o);
		System.out.println("Size of ArrayList : "+arrayList.size());
		Object o1=arrayList.set(1, "James Gosling");
		System.out.println("ArrayList Update : "+o1);
		System.out.println("Updated ArrayList = "+arrayList);
		Object o2=arrayList.remove(4);
		System.out.println("ArrayList Delete : "+o2);
		System.out.println("After Deletion ArrayList = "+arrayList);
		boolean result=arrayList.contains("james Gosling");
		if(result==true)
			System.out.println("Element is exist in the ArrayList");
		else
			System.out.println("Element is not exist in the ArrayList");
		
		ArrayList<Object> arrayList2=new ArrayList<>();
		arrayList2.add(1123);
		arrayList2.add("Gavin");
		arrayList2.add(40000.00);
		
		boolean status=arrayList.addAll(arrayList2);
		if(status==true)
			System.out.println("Two ArrayList have been successfuly added.");
		else
			System.out.println("Not added.");
		System.out.println("Added ArrayList = "+arrayList);
	}
	
	public void employeeInfo2(){
		
		LinkedList<Object> lList=new LinkedList<>();
		lList.add(0, 1122);
		lList.add(1, "James");
		lList.add(2, 80000.00);
		lList.add(3, "james@gmail.com");
		lList.add(4, 1122);
		lList.add(5, null);
		System.out.println("\nLinkedList = "+lList);
	}
	
public void employeeInfo3(){
		
		Vector<Object> vect=new Vector<>();
		vect.add(0, 1122);
		vect.add(1, "James");
		vect.add(2, 80000.00);
		vect.add(3, "james@gmail.com");
		vect.add(4, 1122);
		vect.add(5, null);
		System.out.println("\nVector = "+vect);
	}

}

public class TestArrayList {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.employeeInfo();
//		e.employeeInfo2();
//		e.employeeInfo3();
	}

}
