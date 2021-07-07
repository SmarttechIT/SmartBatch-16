package com.bd;

public class ReturnResult {
	
	public static void main(String[] args) {
		
		ReturnMethod obj = new ReturnMethod();
		obj.getProperty();
		ReturnMethod.getSalary();
		obj.getMoney();
		obj.getUsername();
		System.out.println(obj.getMoney());
		System.out.println(obj.getUsername());

		
	}

}
