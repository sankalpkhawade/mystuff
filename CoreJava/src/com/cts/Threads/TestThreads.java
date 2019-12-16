package com.cts.Threads;

class Employee implements Runnable{
	
	int employeeId;
	String employeeName;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getId()+"\t"+employeeId+"\t"+employeeName+"\t"+Thread.currentThread().getName()+"\t"+Thread.currentThread().getPriority());
		
	}
}

public class TestThreads {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
	
		Employee e1=new Employee();
		e1.employeeId=1020;
		e1.employeeName="james";
		Thread t1=new Thread(e1);
		t1.setName("Employee-1");
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.sleep(1000);
		t1.start();
		
		Employee e2=new Employee();
		e2.employeeId=1021;
		e2.employeeName="Surya";
		Thread t2=new Thread(e2);
		t2.setName("Employee-2");
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.sleep(1500);
		
		t2.start();
//		t2.suspend();
//		t2.resume();
		
//		t2.stop();
//		t2.resume();
		t2.join();
		try{
		t2.wait(500);
		}catch(Exception e){
			System.out.println(e);
		}
		Employee e3=new Employee();
		e3.employeeId=1022;
		e3.employeeName="Bharat";
		Thread t3=new Thread(e3);
		t3.setName("Employee-3");
		t3.sleep(1000);
		t3.start();
	}

}