package com.ltts;

import java.util.Scanner;

class Employee {
	private String Name;
	private String Add;
	private String mobile;
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getAddress() {
		return Add;
	}
	public void setAddress(String Add) {
		this.Add = Add;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}

class EmployeeMain {
	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Name:");
		String Name = sc.next();
		e.setName(Name);
		
		System.out.println("Enter Address:");
		String Add = sc.next();
		e.setAddress(Add);
		
		System.out.println("Enter Mobile:");
		String number = sc.next();
		e.setMobile(number);
		
		System.out.println("The details are:");
		System.out.println("Name :"+e.getName());
		System.out.println("Address :"+e.getAddress());
		System.out.println("Mobile :"+e.getMobile());
		System.out.println("Verify and Update the details:");
		
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1. Update Employee Name");
			System.out.println("2. Update Employee Address");
			System.out.println("3. Update Employee mobile");
			System.out.println("4. All information correct/Exit");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: System.out.println("Current employee name is:"+e.getName());
					System.out.println("Enter the employee name :");
					Name = sc.next();
					e.setName(Name);
					break;
			
			case 2: System.out.println("Current Address is :"+e.getAddress());
					System.out.println("Enter the Address :");
					Add = sc.next();
					e.setAddress(Add);
					break;
			
			case 3: System.out.println("Current Mobile number is :"+e.getMobile());
					System.out.println("Enter the Mobile number :");
					number = sc.next();
					e.setMobile(number);
					break;
			
			case 4: System.out.println("The details are:");
					System.out.println("Name :"+e.getName());
					System.out.println("Address :"+e.getAddress());
					System.out.println("Mobile :"+e.getMobile());
					return;
			
			default: System.out.println("Invalid choice");							
			}	
		}		
	}
}