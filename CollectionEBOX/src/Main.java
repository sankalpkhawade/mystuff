////import java.util.*;
////import java.util.ArrayList;
////
////public class Main {
////
////	public static void main(String[] args) {
////		Scanner sc=new Scanner(System.in);
////		ArrayList<Integer> a=new ArrayList<>();
////		int sum=0,n=sc.nextInt();
////		for(int i=0;i<n;i++)
////		{
////			a.add(sc.nextInt());
////			sum+=a.get(i);
////		}
////		double avg=(double) sum/n;
////		System.out.printf(sum+"\n%.2f",avg);
////	}
////}
//
//
////import java.util.*;
////import java.util.ArrayList;
////
////public class Main {
////
////	public static void main(String[] args) {
////		Scanner sc=new Scanner(System.in);
////		ArrayList<Integer> a=new ArrayList<>();
////		int n=sc.nextInt();
////		for(int i=0;i<n;i++)
////		{
////			a.add(sc.nextInt());	
////		}
////		Collections.sort(a);
////		for(int i=0;i<n;i++)
////		System.out.println(a.get(i));
////	}
////}
//
////import java.util.ArrayList;
////import java.util.Collections;
////import java.util.Scanner;
////import java.lang.Object;	
////
////class Player{
////	private String name;
////	private String country;
////	private String skill;
////	public Player(String name,String country,String skill){
////		this.name=name;
////		this.country=country;
////		this.skill=skill;
////	}
////	public Player() {
////		// TODO Auto-generated constructor stub
////	}
////	public String getName() {
////		return name;
////	}
////	public void setName(String name) {
////		this.name = name;
////	}
////	public String getCountry() {
////		return country;
////	}
////	public void setCountry(String country) {
////		this.country = country;
////	}
////	public String getSkill() {
////		return skill;
////	}
////	public void setSkill(String skill) {
////		this.skill = skill;
////	}
////	public String toString(){
////		return String.format("%-15s %-15s %-15s", getName(),getCountry(),getSkill());
////	}
////}
//// class PlayerBO{
////	 void displayAllPlayerDetails(ArrayList<Object>al){
////		 System.out.println("Player Details");
////		 for(Object p:al){
////			 System.out.println(p);
////		 }
////	 }
//// }
////class Main{	
////
////public static void main(String args[]){
////
////	
////	Scanner s=new Scanner(System.in);
////	System.out.println("Enter the number of players");
////	int n=s.nextInt();
////	Player p[]=new Player[n];
////	s.nextLine();
////	for(int i=0;i<n;i++){
////		p[i]=new Player();
////		System.out.println("Enter the player name");
////		p[i].setName(s.nextLine());
////		System.out.println("Enter the country name");
////		p[i].setCountry(s.nextLine());
////		System.out.println("Enter the skill");
////		p[i].setSkill(s.nextLine());
////	}
////	PlayerBO pb=new PlayerBO();
////	ArrayList<Object> al=new ArrayList<Object>();
////	for(int i=0;i<n;i++){
////	
////	al.add(p[i]);
////	}
////	pb.displayAllPlayerDetails(al);
////	}
////}
//
//
//
//import java.util.*;
//
//class Player{
//	
//	public void playerInfo(){
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number of players");
//		int n=sc.nextInt();
//		HashMap<String, Long> hMap=new HashMap<String,Long>();
//		for(int i=0;i<n;i++)
//		{
//			System.out.println("Enter the details of the player "+i+1);
//			String s=sc.nextLine();
//			long score=sc.nextLong();
//			hMap.put(s,score);		
//		}
//	}
//}
//
//class Main{
//	
//	public static void main(String args[]){
//		Player p=new Player();
//		p.playerInfo();
//	}
//}
