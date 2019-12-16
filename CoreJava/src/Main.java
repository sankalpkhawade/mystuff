//import java.text.*;
//
//public class Main {
//	private static DecimalFormat d=new DecimalFormat("0.00");
//	public static void main(String[] args) {
//		//System.out.println("Hello World!");
//		double buyingPrice=20.54;
//		double sellingPrice=30.50;
//		System.out.println("Buying price is "+d.format(buyingPrice));
//		System.out.println("Selling price is "+d.format(sellingPrice));
//	}
//
//}

//import java.util.*;
//
//class Main{
//	public static void main(String args[]){
//		
//		double x,y,z;
//		double x,y,t,d,z;
//		int x,y,z;
//		int x,y;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number of dozens of toys purchased");
//		x=sc.nextDouble();
//		System.out.println("Enter the price per dozen");
//		y=sc.nextDouble();
//		System.out.println("Enter the selling price of 1 toy");
//		z=sc.nextDouble();
//		sc.close();
//		double w=y/12;
//		double c=((z-w)/w)*100;
//		System.out.printf("Sam's profit percentage is %.2f percent",c);

//		System.out.println("Price of item 1 :");
//		x=sc.nextDouble();
//		System.out.println("Price of item 2 :");
//		y=sc.nextDouble();
//		System.out.println("Discount in percentage :");
//		z=sc.nextDouble();
//		sc.close();
//		t=x+y;
//		d=(double)t*(z/100);
//		double a=t-d;
//		System.out.printf("Total amount : $%.2f",t);
//		System.out.printf("\nDiscounted amount : $%.2f",a);
//		System.out.printf("\nSaved amount : $%.2f",d);

//		System.out.println("Enter x");
//		x=sc.nextInt();
//		System.out.println("Enter y");
//		y=sc.nextInt();
//		System.out.println("Enter z");
//		z=sc.nextInt();
//		sc.close();
//		if(x<y && x<z)
//		{
//				System.out.println("L1 has the minimal seating capacity");
//		}
//		else if(y<z)
//			System.out.println("L2 has the minimal seating capacity");
//		else
//			System.out.println("L3 has the minimal seating capacity");
//		System.out.println("Enter the first number");
//		x=sc.nextInt();
//		System.out.println("Enter the second number");
//		y=sc.nextInt();
//		sc.close();
//		if(x>y)
//			System.out.println(x+" is greater than "+y);
//		else if(y>x)
//			System.out.println(x+" is less than "+y);
//		else
//			System.out.println(x+" is equal to "+y);
//
//	}
//}

//import java.util.*;
//class Main{
//	public static void main(String args[]){

//		String a,b;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the string");
//		a=sc.nextLine();
//		System.out.println("Enter the start string");
//		b=sc.nextLine();
//		sc.close();
//		if(a.startsWith(b)==true)
//			System.out.println("\""+a+"\" starts with \""+b+"\"");
//		else
//			System.out.println("\""+a+"\" does not start with \""+b+"\"");
//		String a,b,c;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the content of the document");
//		a=sc.nextLine();
//		System.out.println("Enter the old name of the company");
//		b=sc.nextLine();
//		System.out.println("Enter the new name of the company");
//		c=sc.nextLine();
//		sc.close();
//		System.out.println("The content of the modified document is");
//		String d=a.replace(b, c);
//		System.out.println(d);

//		String array1[]={"","Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the day number");
//		int n=sc.nextInt();
//		sc.close();
//		System.out.println("Day of the week is "+array1[n]);

//		String array1[]=new String[10];
//		array1[0]="";
//		array1[1]="Sun";
//		array1[2]="Mon";
//		array1[3]="Tue";
//		array1[4]="Wed";
//		array1[5]="Thu";
//		array1[6]="Fri";
//		array1[7]="Sat";
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the day number");
//		int n=sc.nextInt();
//		sc.close();
//		System.out.println("Day of the week is "+array1[n]);

//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int a[]=new int[n];
//		for(int i=0;i<n;i++)
//		{
//			a[i]=sc.nextInt();
//		}
//		sc.close();
//		int sum=0;
//		for(int i=0;i<n;i++)
//		{
//			sum+=a[i];
//		}
//		System.out.println(sum);

//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int i=0,sum=0;
//		int a[]=new int[n];
//		while(i<n)
//		{
//			a[i]=sc.nextInt();
//			sum+=a[i];
//			i++;
//		}
//		sc.close();
//		System.out.println(sum);

//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int a[]=new int[n];
//		for(int i=0;i<n;i++)
//		{
//			a[i]=sc.nextInt();
//		}
//		sc.close();
//		int sum=0;
//		for(int i=0;i<n;i++)
//		{
//			sum+=a[i];
//		}
//		System.out.println(sum);
//	}
//}

//import java.util.*;
//class IllegalArgumentException extends Exception{
//	
//	public IllegalArgumentException(){
//		System.out.println("Buying price or selling price cannot be less than 0");
//	}
//}
//class Profit extends IllegalArgumentException{
//	
//	int dozenCount;
//	int pricePerDozen;
//	int sellPrice;
//	
//	public int getDozenCount() {
//		return dozenCount;
//	}
//
//	public void setDozenCount(int dozenCount) {
//		this.dozenCount = dozenCount;
//	}
//
//	public int getPricePerDozen() {
//		return pricePerDozen;
//	}
//
//	public void setPricePerDozen(int pricePerDozen) {
//		this.pricePerDozen = pricePerDozen;
//	}
//
//	public int getSellPrice() {
//		return sellPrice;
//	}
//
//	public void setSellPrice(int sellPrice) {
//		this.sellPrice = sellPrice;
//	}
//
//	public float calculateProfit(int dozenCount,int pricePerDozen,int sellPrice) throws IllegalArgumentException{
//		try{
//		float x=(float) pricePerDozen/12;
//		float z=(float) sellPrice-x;
//		float w=(float) (z/x)*100;
//		if(sellPrice>0 || pricePerDozen>0)
//		System.out.printf("Sam's profit percentage is %.2f percent",w);
//		}catch (Exception e) {
//			throw new IllegalArgumentException();
//		}
//		return sellPrice;
//		
//	}
//}
//
//class Main{
//	public static void main(String args[]) throws IllegalArgumentException{
//		
//		Profit p=new Profit();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number of dozens of toys purchased");
//		p.setDozenCount(sc.nextInt());
//		System.out.println("Enter the price per dozen");
//		p.setPricePerDozen(sc.nextInt());
//		System.out.println("Enter the selling price of 1 toy");
//		p.setSellPrice(sc.nextInt());
//		sc.close();
//		p.calculateProfit(p.dozenCount, p.pricePerDozen, p.sellPrice);
//	}
//}

//import java.util.*;
//
//class Product{
//	
//	private long id;
//	private String productName;
//	private String supplierName;
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//	public String getProductName() {
//		return productName;
//	}
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//	public String getSupplierName() {
//		return supplierName;
//	}
//	public void setSupplierName(String supplierName) {
//		this.supplierName = supplierName;
//	}
//	
//	
//}
//
//class Main{
//	public static void main(String args[]){
//		
//		Scanner sc=new Scanner(System.in);
//		Product p1=new Product();
//		System.out.println("Enter the product id");
//		long id=sc.nextLong();
//		p1.setId(id);
//		System.out.println("Enter the product name");
//		String productName=sc.next();
//		p1.setProductName(productName);
//		System.out.println("Enter the supplier name");
//		String supplierName=sc.next();
//		p1.setSupplierName(supplierName);
//		sc.close();
//		System.out.println("Product Id is "+p1.getId());
//		System.out.println("Product Name is "+p1.getProductName());
//		System.out.println("Supplier Name is "+p1.getSupplierName());
//	}
//}

//import java.util.*;
//
//class Product{
//	
//	private long id;
//	private String productName;
//	private String supplierName;
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//	public String getProductName() {
//		return productName;
//	}
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//	public String getSupplierName() {
//		return supplierName;
//	}
//	public void setSupplierName(String supplierName) {
//		this.supplierName = supplierName;
//	}
//	
//	void display(){
//		
//		System.out.println("Product Id is "+getId());
//		System.out.println("Product Name is "+getProductName());
//		System.out.println("Supplier Name is "+getSupplierName());
//		
//	}
//}
//
//class Main{
//	public static void main(String args[]){
//		
//		Scanner sc=new Scanner(System.in);
//		Product p1=new Product();
//		System.out.println("Enter the product id");
//		long id=sc.nextLong();
//		p1.setId(id);
//		System.out.println("Enter the product name");
//		String productName=sc.next();
//		p1.setProductName(productName);
//		System.out.println("Enter the supplier name");
//		String supplierName=sc.next();
//		p1.setSupplierName(supplierName);
//		sc.close();
//		p1.display();
//	}
//}

//
//import java.util.*;
//class Student{
//	
//	private int employeeId;
//	private String name;
//	private static final String COHORT_CODE = "CHNAJ19004"; 
//	
//	public Student() {
//		
//	}
//	
//	public Student(int employeeId, String name){
//		this.employeeId=employeeId;
//		this.name=name;
//	}
//	
//	
//	public int getEmployeeId() {
//		return employeeId;
//	}
//
//	public void setEmployeeId(int employeeId) {
//		this.employeeId = employeeId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public static String getCohortCode() {
//		return COHORT_CODE;
//	}
//
//	public void display(){
//			System.out.println(getEmployeeId()+" "+getName()+" "+COHORT_CODE);
//	}
//}
//
//class Main{
//	public static void main(String args[]){
//		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter the number of GenCs");
//		int n=sc.nextInt();
//		Student s[]=new Student[n];
//		for(int i=0;i<n;i++)
//		{
//			s[i]=new Student();
//			System.out.println("Enter Employee Id");
//			s[i].setEmployeeId(sc.nextInt());
//			System.out.println("Enter Name");
//			s[i].setName(sc.next());
//		}
//		sc.close();
//		for(int j=0;j<n;j++)
//		{
//			s[j].display();
//		}
//	}
//}
//

//-----------------------JUnit------------------------------

import java.util.*;

class Profit {
	float costPrice;
	float pl;
	float plPercent;

	public float calculateProfit(int dozenCount, int pricePerDozen, int sellPrice) throws IllegalArgumentException {
		try {
			costPrice = (float) pricePerDozen / 12;
			pl = (float) sellPrice - costPrice;
			plPercent = (float) (pl * 100) / costPrice;
			// System.out.println(costPrice+" "+pl+" "+plPercent);
			// return plPercent;
		} catch (IllegalArgumentException e) {
			System.out.println("Buying price or selling price cannot be lesser than 0");
		}
		return plPercent;
	}
}

public class Main {
	// private static DecimalFormat
	public static void main(String[] args) {
		Profit p = new Profit();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of dozens of toys purchased");
		int x = sc.nextInt();
		System.out.println("Enter the price per dozen");
		int y = sc.nextInt();
		System.out.println("Enter the selling price of 1 toy");
		int z = sc.nextInt();
		sc.close();
		float plPer = p.calculateProfit(x, y, z);
		if (y > 0 && z > 0) {
			System.out.printf("Sam's profit percentage is %.2f percent", plPer);
		} else {
			throw new IllegalArgumentException();
			// System.out.println("Buying price or selling price cannot be
			// lesser than 0");
		}
	}
}
