package com.cts.oops;


class Login{
	
	String userName="James";
	String password="java";
	
	public void loginInfo(String password){
		System.out.println("----Login----");
		System.out.println("User Name : "+userName);
		System.out.println("Password : "+password);
	}
}

class ChangePassword extends Login{
	
	public void loginInfo(String password){
		System.out.println("----Change Password----");
		System.out.println("User Name : "+userName);
		System.out.println("Password : "+password);
	}
}

public class TestOverriding {

	public static void main(String[] args) {
		
//		ChangePassword cpwd=new ChangePassword();
//		cpwd.loginInfo("password");
		
		Login l=new ChangePassword();
		l.loginInfo("Gosling");
	}

}
