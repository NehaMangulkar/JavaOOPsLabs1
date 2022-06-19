package com.learning;

import java.util.Scanner;

import com.learning.module.Employee;
import com.learning.services.Credential_Services;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		
		Employee emp=new Employee("Neha","Mangulkar");
		
		System.out.println("Enter department :\n"
				+"1.Technical \n"
				+"2. Admin \n"
				+"3. Human Resources \n"
				+"4. Legal");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a choice");
		ch=sc.nextInt();
		
		String dept;
		
		switch(ch){
		
		case 1:
			dept="tech";
			break;
			
		case 2:
			dept="adm";
			break;
			
		case 3:
			dept="hr";
			break;
			
		case 4:
			dept="lgl";
			break;
			
			default:
				
				throw new  IllegalArgumentException("Wrong input " + ch);
				
		}
		
		
		Credential_Services cs=new Credential_Services();
		 String email= cs.generateEmailAddress(emp, dept);
		 String password=cs.generatePassword();
		 
		 cs.showCredentials(emp.getFirstName(), password, email);
		
		
		

	}

}
