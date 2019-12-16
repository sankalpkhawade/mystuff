package com.cts.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		FileInputStream fiStream=new FileInputStream("employee.txt");
		ObjectInputStream olStream=new ObjectInputStream(fiStream);
		Object o=olStream.readObject();
		Employee3 e=(Employee3) o;
		System.out.println("Object has been successfully Deserialized");
		System.out.println(e.getEmployeeId()+"\t"+e.getEmployeeName()+"\t"+e.getSalary()+"\t"+e.getMobileNumber()+"\t"+e.getMobileNumber()+"\t"+e.getPassword());
		fiStream.close();
	}

}
