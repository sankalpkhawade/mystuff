package com.cts.filehandling;

import java.io.File;
import java.io.IOException;

class Employee{
	
	int employeeId=1122;
	String employeeName="James";
	
	public void creatEmployeeFile() throws IOException{
		
		File f=new File("emoloyee.txt");
		boolean result=f.createNewFile();
		if(result==true)
			System.out.println("File has been successfully created.");
		else
			System.out.println("File is not created.");
	}
}

public class TestFileReadWrite {

	public static void main(String[] args) throws IOException {
	
		Employee e=new Employee();
		e.creatEmployeeFile();
	}

}
