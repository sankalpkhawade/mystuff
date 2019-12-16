package com.cts.collections;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Test{
	
	public void m1(){
		
		Date utilDate=new Date();
		System.out.println("util date : "+utilDate);
	}
	@Deprecated
	public void m2(){

		java.sql.Date sqlDate=new java.sql.Date(07,18,2019);
		System.out.println("sqlDate : "+sqlDate);
		
	}
	public void m3(){
		Date d=new Date();
		String s=DateFormat.getInstance().format(d);
		String s1=DateFormat.getDateInstance().format(d);
		String s2=DateFormat.getTimeInstance().format(d);
		String s3=DateFormat.getDateTimeInstance().format(d);
		System.out.println("Date Format : \n"+s+"\n"+s1+"\n"+s2+"\n"+s3);
	}
	
	public void m4(){
		Date d=new Date();
		SimpleDateFormat sdFormat=new SimpleDateFormat("MM/dd/yyyy");
		String s=sdFormat.format(d);
		System.out.println("Simple Date Format : "+s);
	}
	
}

public class TestDateAPI {

	public static void main(String[] args) {
		
		Test t=new Test();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
	}

}
