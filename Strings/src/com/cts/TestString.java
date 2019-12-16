package com.cts;

class Employee{
	String userName;
	String password;
	String emailId;
	
	//Constructor Employee
	public Employee(String userName, String password, String emailId){
		this.userName=userName;
		this.password=password;
		this.emailId=emailId;
	}
	
	//give length of string
	public void lengthOfString(){
		
		int l=userName.length();
		int m=password.length();
		int n=emailId.length();
		System.out.println("Length of String : "+l);
		System.out.println("Length of String : "+m);
		System.out.println("Length of String : "+n);
	}
	
	//put value at that place
	public void characterAt(){
		char c=userName.charAt(2);
		System.out.println("Character at specific location : "+c);
	}
	
	//find index of character
	public void indexOfCharacter(){
		int i=password.indexOf('a');
		System.out.println("Index of Specific character : "+i);
	}
	
	//last index of character
	public void lastIndexOfCharacter(){
		int j=password.lastIndexOf('a');
		System.out.println("Last Index of Specific character : "+j);
	}
	
	
	//replace character
	public void replaceOfString(){
		String p=password.replace('j', 'b');
		System.out.println("Replace Specific character : "+p);
	}
	
	public void concatinationString(){
		String u=userName.concat(password);
		System.out.println("Concatination of two string : "+u);
	}
	
	//substring
	public void substringMethod(){
		String v=userName.substring(5);
		System.out.println("Substring : "+v);
	}
	
	//startWith
	public void startWithCharacter(){
		boolean a=password.startsWith(emailId);
		System.out.println("String start with : "+a);
	}
	
	//endWith
		public void endWithCharacter(){
			boolean h=password.endsWith(password);
			System.out.println("String end with : "+h);
		}
		
	//Split
		public void splitString(){
			String[] q=emailId.split("@");
			System.out.print("split: ");
			for(int i=0;i<q.length;i++)
			System.out.print(" "+q[i]);
		}
		
		//contains
		public void containString(){
			boolean f=password.contains(userName);
			System.out.println("\nContains : "+f);
		}
		
		//
		public void isEmptyString(){
			boolean r=password.isEmpty();
			System.out.println("String Empty : "+r);
		}
		
		//intern
		public void internString(){
			 String y = password.intern();
			 System.out.println("Intern string : "+y);
		}
		
		//valueOf
		public void valueOfString(){
			int a1=10;
			String e=String.valueOf(a1);
			System.out.println("String Value : "+e);
		}
		
		//format
		public void formatString(){
			String w=String.format("format %s",password);
			System.out.println("Format string : "+w);
		}
		
		//trim
		public void trimString(){
			String j=userName.trim();
			System.out.println("Trim string : "+j);
		}
		
		//toCharArray
		public void toCharArray(){
			char[] o=password.toCharArray();
			System.out.print("CharArray string : ");
			for(int i=0;i<o.length;i++){
			System.out.print(""+o[i]+" ");
			}
		}
		
		//toLower
		public void toLowerCase(){
			String m=userName.toLowerCase();
			System.out.println("\nLower Case string : "+m);
		}
		
		//toUpper
		public void toUpper(){
			String k=password.toUpperCase();
			System.out.println("Upper Case string : "+k);
		}
		
		//toString
		public void toStringConvert(){
			String d1=password.toString();
			System.out.println("ToString string : "+d1);
		}

}

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("James Gosling","java","james@gmail.com");
		e1.lengthOfString();
		e1.characterAt();
		e1.indexOfCharacter();
		e1.lastIndexOfCharacter();
		e1.replaceOfString();
		e1.concatinationString();
		e1.substringMethod();
		e1.startWithCharacter();
		e1.endWithCharacter();
		e1.splitString();
		e1.containString();
		e1.isEmptyString();
		e1.internString();
		e1.valueOfString();
		e1.formatString();
		e1.trimString();
		e1.toCharArray();
		e1.toLowerCase();
		e1.toUpper();
		e1.toString();
	}

}
