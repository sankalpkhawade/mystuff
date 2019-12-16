package com.cts.oops;
import java.util.*;
import java.text.*;

class Movies{

	private String Title;
	private String boxOffice;
	private boolean Status=true;
	private Date dateOfLaunch;
	private String Genre;
	private boolean hasTeaser=true;
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getBoxOffice() {
		return boxOffice;
	}
	public void setBoxOffice(String boxOffice) {
		this.boxOffice = boxOffice;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	
	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}
	public void setDateOfLaunch(Date dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public boolean isHasTeaser() {
		return hasTeaser;
	}
	public void setHasTeaser(boolean hasTeaser) {
		this.hasTeaser = hasTeaser;
	}
	
}

public class TestEncapsulation2 {

	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
		Date d1=f.parse("15/03/2017");
		String s1= f.format(d1);
		
		Date d2=f.parse("23/12/2017");
		String s2= f.format(d1);
		
		Date d3=f.parse("21/08/2017");
		String s3= f.format(d2);
		
		Date d4=f.parse("02/07/2017");
		String s4= f.format(d1);
		
		Date d5=f.parse("02/11/2017");
		String s5= f.format(d1);
		
		Movies m=new Movies();
		Movies m1=new Movies();
		Movies m2=new Movies();
		Movies m3=new Movies();
		Movies m4=new Movies();
		
		m.setTitle("Avatar");
		m.setBoxOffice("$2,787,965,087");
		m.setStatus(true);
		m.setDateOfLaunch(d1);
		m.setGenre("Science Fiction");
		m.setHasTeaser(true);
		
		m1.setTitle("The Avengers");
		m1.setBoxOffice(" $1,518,812,988 ");
		m1.setStatus(true);
		m1.setDateOfLaunch(d2);
		m1.setGenre("Superhero");
		m1.setHasTeaser(false);
		
		m2.setTitle("Titanic");
		m2.setBoxOffice("$2,187,463,944");
		m2.setStatus(true);
		m2.setDateOfLaunch(d3);
		m2.setGenre("Romance");
		m2.setHasTeaser(false);
		
		m3.setTitle("Jurassic World");
		m3.setBoxOffice(" $1,671,713,208 ");
		m3.setStatus(false);
		m3.setDateOfLaunch(d4);
		m3.setGenre("Science Fiction");
		m3.setHasTeaser(true);
		
		m4.setTitle("Avengers: End Game");
		m4.setBoxOffice("$2,750,760,348");
		m4.setStatus(true);
		m4.setDateOfLaunch(d5);
		m4.setGenre("Superhero");
		m4.setHasTeaser(true);
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Title \t \t \t  Box Office \t \t\tActive \t\t\tDate of Launch \t \t \t Genre\t\t\tHas Teaser");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(m.getTitle()+"\t \t \t "+m.getBoxOffice()+"\t \t \t"+m.isStatus()+"\t \t \t"+s1+"\t \t \t"+m.getGenre()+"\t \t"+m.isHasTeaser());
		System.out.println(m1.getTitle()+"\t\t"+m1.getBoxOffice()+"\t \t"+m1.isStatus()+"\t \t \t"+s2+"\t \t \t"+m1.getGenre()+"\t \t"+m1.isHasTeaser());
		System.out.println(m2.getTitle()+"\t\t \t "+m2.getBoxOffice()+"\t \t \t"+m2.isStatus()+"\t \t \t"+s3+"\t \t \t"+m2.getGenre()+"\t \t \t"+m2.isHasTeaser());
		System.out.println(m3.getTitle()+"\t\t"+m3.getBoxOffice()+"\t \t"+m3.isStatus()+"\t \t \t"+s4+"\t \t \t"+m3.getGenre()+"\t \t"+m3.isHasTeaser());
		System.out.println(m4.getTitle()+"\t "+m4.getBoxOffice()+"\t \t \t"+m4.isStatus()+"\t \t \t"+s5+"\t \t \t"+m4.getGenre()+"\t \t"+m4.isHasTeaser());	
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
	}
}
