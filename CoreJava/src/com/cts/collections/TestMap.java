package com.cts.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Employee4{

	public void employeeInfo1(){
		
		TreeMap<Object, Object> tMap=new TreeMap<>();
		tMap.put(1021, "James");
		tMap.put(1023, "Gosling");
		tMap.put(1022, "Gavin");
		tMap.put(1024, "King");
		
		System.out.println("TreeMap elements : "+tMap);
	}
	
	public void employeeInfo2(){
		
		LinkedHashMap<Object, Object> lhMap=new LinkedHashMap<>();
		lhMap.put(1021, "James");
		lhMap.put(1023, "Gosling");
		lhMap.put(1022, "Gavin");
		lhMap.put(1024, "King");
		lhMap.put(null, null);
		
		System.out.println("LinkedHashMap elements : "+lhMap);
	}
	
	public void employeeInfo3(){
			
		HashMap<Object, Object> hMap=new HashMap<>();
		hMap.put(1021, "James");
		hMap.put(1023, "Gosling");
		hMap.put(1022, "Gavin");
		hMap.put(1024, "King");
		hMap.put(null, null);
		
		System.out.println("HashMap elements : "+hMap);
	}
	
	public void employeeInfo4(){
		
		Hashtable<Object, Object> ht=new Hashtable<>();
		ht.put(1021, "James");
		ht.put(1023, "Gosling");
		ht.put(1022, "Gavin");
		ht.put(1024, "King");
		
		System.out.println("Hashtable elements : "+ht);
	}
}

public class TestMap {

	public static void main(String[] args) {
		
		Employee4 e=new Employee4();
		e.employeeInfo1();
		e.employeeInfo2();
		e.employeeInfo3();
		e.employeeInfo4();
	}

}
