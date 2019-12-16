//import java.util.*;
//
//interface IPlayerStatics{
//	
//	public void displayPlayerStatics();
//}
//
//abstract class Player implements IPlayerStatics{
//	protected String name;
//	protected String teamName;
//	protected int noOfMatches;
//	
//	public Player(String name,String teamName,int noOfMatches){
//		this.name=name;
//		this.teamName=teamName;
//		this.noOfMatches=noOfMatches;
//	}
//}
//
//class CricketPlayer extends Player implements IPlayerStatics{
//
//	private int totalRunsScored;
//	private int noOfWicketsTaken;
//	
//	public CricketPlayer(String name, String teamName, int noOfMatches,int totalRunsScored,int noOfWicketsTaken) {
//		super(name, teamName, noOfMatches);
//		this.totalRunsScored=totalRunsScored;
//		this.noOfWicketsTaken=noOfWicketsTaken;
//	}
//	
//	public void displayPlayerStatics(){
//		System.out.println("Player Details");
//		System.out.println("Player name : "+name);
//		System.out.println("Team name : "+teamName);
//		System.out.println("No of matches : "+noOfMatches);
//		System.out.println("Total runsscored : "+totalRunsScored);
//		System.out.println("No of wickets taken : "+noOfWicketsTaken);
//	}
//}
//
//class HockeyPlayer extends Player{
//
//	private String position;
//	private int noOfGoals;
//	
//	public HockeyPlayer(String name, String teamName, int noOfMatches,String position,int noOfGoals) {
//		super(name, teamName, noOfMatches);
//		this.position=position;
//		this.noOfGoals=noOfGoals;
//	}
//	
//	public void displayPlayerStatics(){
//		System.out.println("Player Details");
//		System.out.println("Player name : "+name);
//		System.out.println("Team name : "+teamName);
//		System.out.println("No of matches : "+noOfMatches);
//		System.out.println("Position : "+position);
//		System.out.println("No of goals taken : "+noOfGoals);
//	}	
//}
//
//public class Main {
//
//	public static void main(String[] args){
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Menu");
//		System.out.println("1.Crciket Player Details");
//		System.out.println("2.Hockey Player Details");
//		System.out.println("Enter choice");
//	//	CricketPlayer cp=new CricketPlayer(sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt());
//	//	HockeyPlayer hp=new HockeyPlayer(sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextLine(),sc.nextInt());
//		int n=sc.nextInt();
//		switch(n){
//		case 1:
//			sc.nextLine();
//			System.out.println("Enter player name");
//			String name=sc.nextLine();
//			System.out.println("Enter team name");
//			String teamName=sc.nextLine();
//			System.out.println("Enter number of matches played");
//			int noOfMatches=sc.nextInt();
//			System.out.println("Enter total runs scored");
//			int totalRunsScored=sc.nextInt();
//			System.out.println("Enter total number of wickets taken");
//			int noOfWicketsTaken=sc.nextInt();
//			CricketPlayer cp=new CricketPlayer(name,teamName,noOfMatches,totalRunsScored,noOfWicketsTaken);
//			cp.displayPlayerStatics();
//			break;
//		case 2:
//			sc.nextLine();
//			System.out.println("Enter player name");
//			String name1=sc.nextLine();
//			System.out.println("Enter team name");
//			String teamName1=sc.nextLine();
//			System.out.println("Enter number of matches played");
//			int noOfMatches1=sc.nextInt();
//			System.out.println("Enter the position");
//			String position=sc.next();
//			System.out.println("Enter total number of goals taken");
//			int noOfGoals=sc.nextInt();
//			HockeyPlayer hp=new HockeyPlayer(name1,teamName1,noOfMatches1,position,noOfGoals);
//			hp.displayPlayerStatics();
//			break;
//		default:
//			System.out.println("Invalid Input");
//			break;
//		}
//	}
//
//}


//import java.util.*;
//
//class Product{
//	
//	private long id;
//	private String productName;
//	private String supplierName;
//	
//	public Product(){
//		
//	}
//	
//	public Product(long id,String productName,String supplierName){
//		
//		this.id=id;
//		this.productName=productName;
//		this.supplierName=this.supplierName;
//		
//	}
//	
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
//		System.out.println("Product Id is "+id);
//		System.out.println("Product Name is "+productName);
//		System.out.println("Supplier Name is "+supplierName);
//	}
//	public boolean equals(Product obj){
//		
//		if(!(this.id==obj.getId()))
//			return false;
//		else if(!(this.productName.equals(obj.getProductName())))
//			return false;
//		else if(!(this.supplierName.equals(obj.getSupplierName())))
//			return false;
//		
//		return true;
//	}
//}
//
//class Main{
//	
//	public static void main(String args[]){
//		
//		Scanner sc=new Scanner(System.in);
//		Product p1=new Product();
//		Product p2=new Product();
//		System.out.println("Enter the product id");
//		long id=sc.nextLong();
//		p1.setId(id);
//		System.out.println("Enter the product name");
//		String productName=sc.next();
//		p1.setProductName(productName);
//		System.out.println("Enter the supplier name");
//		String supplierName=sc.next();
//		p1.setSupplierName(supplierName);
//		p1.display();
//		
//		System.out.println("Enter the product id");
//		long id1=sc.nextLong();
//		p2.setId(id1);
//		System.out.println("Enter the product name");
//		String productName1=sc.next();
//		p2.setProductName(productName1);
//		System.out.println("Enter the supplier name");
//		String supplierName1=sc.next();
//		p2.setSupplierName(supplierName1);
//		p2.display();
//		if(p1.equals(p2))
//			System.out.println("The two products are the same");
//		else
//			System.out.println("The two products are different");
//		
//	}
//}

//import java.util.*;
//import java.lang.*;
//class Product{
//	
//	private int id;
//	private String productName;
//	private String supplierName;
//	
//	public Product(){
//		
//	}
//	
//	public Product(int id,String productName,String supplierName){
//		
//		this.id=id;
//		this.productName=productName;
//		this.supplierName=this.supplierName;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getProductName() {
//		return productName;
//	}
//
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//
//	public String getSupplierName() {
//		return supplierName;
//	}
//
//	public void setSupplierName(String supplierName) {
//		this.supplierName = supplierName;
//	}
//	public String toString(){
//		
//		return id+" : "+productName+" : "+supplierName;
//		
//	}
//}
//
//class Main{
//	
//	public static void main(String args[]){
//		
//		Scanner sc=new Scanner(System.in);
//		Product p1=new Product();
//		System.out.println("Enter the product id");
//		int id=sc.nextInt();
//		p1.setId(id);
//		sc.nextLine();
//		System.out.println("Enter the product name");
//		String productName=sc.nextLine();
//		p1.setProductName(productName);
//		System.out.println("Enter the supplier name");
//		String supplierName=sc.nextLine();
//		p1.setSupplierName(supplierName);
//		System.out.println(p1.toString());
//		System.out.println("Invoking getClass() method : "+p1.getClass());
//	}
//}
