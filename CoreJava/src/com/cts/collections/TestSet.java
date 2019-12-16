package com.cts.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Employee3{
	
	public void employeeInfo1(){
		
		TreeSet<Object> tSet=new TreeSet<Object>();
		tSet.add("James");
		tSet.add("Gosling");
		tSet.add("Gavin");
		tSet.add("King");
		System.out.println("TreeSet Elements : "+tSet);
	}
	
	public void employeeInfo2(){
		
		LinkedHashSet<Object> lhSet=new LinkedHashSet<>();
		lhSet.add(1020);
		lhSet.add("James");
		lhSet.add(25000.00);
		lhSet.add("James");
		lhSet.add("james@gmail.com");
		lhSet.add(null);
		System.out.println("LinkedHashSet Elements : "+lhSet);
	}
	
	public void employeeInfo3(){
		
		HashSet<Object> hSet=new HashSet<>();
		hSet.add(1);
		hSet.add("James");
		hSet.add(null);
		hSet.add(25000.00);
		System.out.println("HashSet Elements : "+hSet);
	}
}

public class TestSet {

	public static void main(String[] args) {
	
		Employee3 e1=new Employee3();
		e1.employeeInfo1();
		e1.employeeInfo2();
		e1.employeeInfo3();
	}

}
