package com.learning.services;

import java.util.Random;

import com.learning.module.Employee;

public class Credential_Services {
	
	public String generatePassword()
	{
		int first=(int)'!'; //this value will  be 36
		int last=(int) '~'; //126
		
		int range= last-first;
		
		
		
		Random random=new Random();
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<8;i++)
		{
			int randomNumber= random.nextInt(range);
			randomNumber=randomNumber+first;  //convertign 0 93 to  33 to 126
			
			char randomCharacter=(char)randomNumber;
			
		sb.append(randomCharacter);
			
		}
		return sb.toString();
	}
	
	public String generateEmailAddress(Employee emp, String dept)
	{
		String email=String.format("%s%s@%s.company.com",emp.getFirstName(),emp.getLastName(),dept);
		
		return email;
	}
	//SIngle responsibility principle - to display the creds
	public void showCredentials(String firstName,String password,String email)
	{
		System.out.printf("Dear %s  your generated credentials are as follows \n "
	+"Email ---> %s \n"
				+"Password ---> %s" , firstName, email, password);
	
	}

}
