package com.cts.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Employee2{
	
	public void employeeInfo() throws IOException{
		FileReader fr=new FileReader("employee.txt");
		int i;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
		fr.close();
	}
}

public class TestFileRead {

	public static void main(String[] args) throws IOException {
	
		Employee2 e=new Employee2();
		e.employeeInfo();
	}

}

