package com.cts.filehandling;

import java.io.FileWriter;
import java.io.IOException;

class Employee1{
	
	public void employeeInfo() throws IOException{
		
		FileWriter fw=new FileWriter("employee.txt");
		String data="Java is programming language.";
		fw.write(data);
		System.out.println("Data has been successfully inserted into the file.");
		fw.close();
	}
}

public class TestFileWrite {

	public static void main(String[] args) throws IOException {
		
		Employee1 e1=new Employee1();
		e1.employeeInfo();
	}

}
