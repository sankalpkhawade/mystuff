package com.cts;

public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("James@gmail.com");
		StringBuffer s1=new StringBuffer("Welcome");
		int p=s.length();
		int q=s.capacity();
		s.replace(12,15,"co.in");
		System.out.println("Length : "+p);
		System.out.println("Capacity : "+q);
		System.out.println("CharAt : "+s.charAt(2));
		System.out.println("Replaced String : "+s);
		System.out.println("Append : "+s.append(".com"));
		System.out.println("SubString : "+s.substring(2));
		System.out.println("CharAt : "+s.charAt(4));
		System.out.println("CodePointAt : "+s.codePointAt(4));
		System.out.println("CodePointBefore : "+s.codePointBefore(4));
		System.out.println("CodePointCount : "+s.codePointCount(0,3));
		System.out.println("HastCode : "+s.hashCode());
		System.out.println("String Equals : "+s.equals(s));
		System.out.println("SubString Limit : "+s.substring(4,9));
		System.out.println("After Deletion : "+s.delete(11,17));
		System.out.println("Reverse String : "+s1.reverse());
		s.setCharAt(6,'D');
		System.out.println("After setting CharAt : "+s);
	}

}
