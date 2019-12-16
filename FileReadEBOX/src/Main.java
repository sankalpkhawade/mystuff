//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;
//import java.io.FileNotFoundException;
//
//public class Main {
//
//	public static void main(String[] args) throws IOException {
//	
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the file name");
//		String a=sc.nextLine();
//		FileReader fr=new FileReader(a);
//		int i;
//		while((i=fr.read())!=-1)
//			System.out.print((char)i);
//		fr.close();
//		sc.close();
//
//	}
//	
//}
//

//---------------------------------------------------------------------------------

//import java.awt.List;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.Writer;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) throws IOException {
//		
//		Scanner sc=new Scanner(System.in);
//		List rows = (List) Arrays.asList(Arrays.asList(sc.nextLine(), sc.nextLine(), sc.nextInt()));
//		FileWriter csvWriter=new FileWriter("player.csv");
//		csvWriter.append(sc.nextLine());
//		csvWriter.append(",");
//		csvWriter.append(sc.nextLine());
//		csvWriter.append(",");
//		csvWriter.append((char) sc.nextInt());
//		csvWriter.append("\n");
//		System.out.println("Enter the name of the player");
//		String playerName=sc.nextLine();
//		System.out.println("Enter the team name");
//		String teamName=sc.nextLine();
//		System.out.println("Enter the number of matches played");
//		int noOfMatches=sc.nextInt();
//		csvWriter.write(playerName);
//		csvWriter.write(teamName);
//		csvWriter.write(noOfMatches);
//		csvWriter.close();
//	}
//}

//---------------------------------------------------------------------------------

//import java.text.SimpleDateFormat;
//import java.util.*;
//
//class Main{
//	public static void main(String args[]){
//		
//		Scanner sc=new Scanner(System.in);
//		String date=sc.nextLine();
//		Date d=new Date(date);
//		SimpleDateFormat sdFormat=new SimpleDateFormat("YYYY-MM-dd");
//		String s=sdFormat.format(d);
//		System.out.println(s);
//	}
//}

//---------------------------------------------------------------------------------

//
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//class UserMainCode{
//	
//	@SuppressWarnings("deprecation")
//	static void displayDate(){
//		
//		Date d=new Date();
//		String s=DateFormat.getInstance().format(d);
//		
//		SimpleDateFormat sdFormat=new SimpleDateFormat("YYYY-MM-dd");
//		String s1=sdFormat.format(d);
//		System.out.println(s1);
//	}
//
//}
//
//class Main{
//	public static void main(String args[]){
//		
//		UserMainCode.displayDate();
//		Scanner sc=new Scanner(System.in);
//		String date=sc.nextLine();
//		sc.close();	
//	}
//}
//

//---------------------------------------------------------------------------------


//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Scanner;
//	
//
//class Player{
//	
//	public void info(){
//		HashMap<String,Long> map=new HashMap<String,Long>();
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the number of players");
//		int n=s.nextInt();
//		s.nextLine();
//		for(int i=0;i<n;i++){
//			System.out.println("Enter the details of the player "+(i+1));
//			
//			map.put(s.nextLine(), s.nextLong());
//			if(i!=n-1){
//				s.nextLine();
//			}
//			
//		}
//		 Long maxValueInMap=(Collections.max(map.values()));
//		 for (java.util.Map.Entry<String, Long> entry : map.entrySet()) {  // Itrate through hashmap
//	            if (entry.getValue()==maxValueInMap) {
//	                System.out.println(entry.getKey());     // Print the key with max value
//	            }
//	        }
//		 
//	}
//}
//
//class Main{	
//
//public static void main(String args[]){
//
//	Player p=new Player();
//	p.info();
//	}
//}

//---------------------------------------------------------------------------------

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.List;
//import java.util.Scanner;
//import java.util.Set;
//import java.util.TreeSet;
//
//class Box{
//private double length,height,width;
//public Box(double length,double width,double height) {
//this.height=height;
//this.length=length;
//this.width=width;
//}
//public Box() {
//
//}
//public double getLength() {
//return length;
//}
//
//public void setLength(double length) {
//this.length = length;
//}
//
//public double getHeight() {
//return height;
//}
//
//public void setHeight(double height) {
//this.height = height;
//}
//
//public double getWidth() {
//return width;
//}
//
//public void setWidth(double width) {
//this.width = width;
//}
//public boolean equals(Object b) {
//Box e=(Box) b;
//double vol=this.height*this.length*this.width;
//double vol1=e.getHeight()*e.getLength()*e.getWidth();
//if(vol==vol1) {
//return true;
//}else {
//return false;
//}
//}
//
//
//}
//class Volume implements Comparator<Object>{
//
//@Override
//public int compare(Object o1, Object o2) {
//
//Box b=(Box) o1;
//Box b1=(Box) o2;
//double volume=b.getHeight()*b.getLength()*b.getWidth();
//double volume1=b1.getHeight()*b1.getLength()*b1.getWidth();
//if(volume>volume1) {
//return 1;
//}else if(volume==volume1) {
//return 0;
//}else
//return -1;
//}
//
//
//
//}
//public class Main {
//
//public static void main(String[] args) {
//// TODO Auto-generated method stub
//int flag=0;
//Scanner s=new Scanner(System.in);
//System.out.println("Enter the number of Box");
//int n=s.nextInt();
//Set<Box> hm=new LinkedHashSet<Box>();
//Box b[]=new Box[n];
//for(int i=0;i<n;i++) {
//b[i]=new Box();
//System.out.println("Enter the Box "+(i+1)+" details");
//System.out.println("Enter Length");
//b[i].setLength(s.nextDouble());
//System.out.println("Enter Width");
//b[i].setWidth(s.nextDouble());
//System.out.println("Enter Height");
//b[i].setHeight(s.nextDouble());
////double volume=b[i].getHeight()*b[i].getLength()*b[i].getWidth();
//if(i>0) {
//flag=0;
//for(Object g:hm)
//if(b[i].equals(g)) {
//flag=1;
//break;
//}
//}else {
//hm.add(b[i]);
//}
//if(flag==0) {
//hm.add(b[i]);
//}
//
//}	
//System.out.println("Unique Boxes in the Set are");
//
//List<Box> numbersList = new ArrayList<Box>(hm) ;
//Collections.sort(numbersList, new Volume());
//for(Object l:numbersList)
//{
//Box p=(Box) l;
//System.out.printf("Length ="+p.getLength()+" Width ="+p.getWidth()+" Height ="+p.getHeight()+" Volume =%.2f\n",p.getHeight()*p.getLength()*p.getWidth());
//}
//}
//
//}
//---------------------------------------------------------------------------------
//import java.util.*;
//import java.io.*;
//
//public class Main {
//
//                public static void main(String[] args) throws IOException
//                {
//                                Scanner n = new Scanner(System.in);
//                                System.out.println("Enter the name of the player ");
//                                String s1 = n.nextLine();
//                                System.out.println("Enter the team name");
//                                String s2 = n.nextLine();
//        System.out.println("Enter the number of matches played");
//        String s3 = n.nextLine();
//        File fw=new File("user.csv");
//        fw.createNewFile();
//        FileWriter f =new FileWriter(fw);
//        f.write(s1+","+s2+","+s3);
//      
//        
//        f.close();
//        
//        
//                }
//                
//}


//import java.sql.Date;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Scanner;
//import java.sql.Date;
//
//public class Main {
//
//                public static void main(String args[]){
//                                
//                                Scanner scan=new Scanner(System.in);
//                                
//                                String s=scan.nextLine();
//                                Calendar cal=Calendar.getInstance();
//                                cal.setTime(Date.valueOf(s));
//                                cal.add(cal.MONTH,-20);
//                                System.out.print("20 months before "+s+" will be ");
//                                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//                                System.out.println(formatter.format(cal.getTime()));
//                                                                
//                }
//                
//}
