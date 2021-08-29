package com.rahulawasthi.main;
import java.util.Scanner;
import com.rahulawasthi.model.*;
import com.rahulawasthi.services.CredentialServices;

public class Driver {
	private static final Scanner sc = new Scanner( System.in );
	
	public static void main(String[] args) {
	System.out.println( "First name : ");
			String firstName = sc.next();
			
			System.out.println( "Last name : " );
			String lastName = sc.next();
			
			System.out.println( "Choose your department : " );
			System.out.println( "1. Technical" );
			System.out.println( "2. Admin" );
			System.out.println( "3. Human Resources" );
			System.out.println( "4. Legal" );
			
			int choice = sc.nextInt();
		
			// create an Employee object using the details you obtained
			Employee emp;
			
			switch( choice ) {
				case 1:
					emp = new Employee( firstName, lastName, "tech" );
					break;
				case 2:
					emp = new Employee( firstName, lastName, "adm" );
					break;
				case 3:
					emp = new Employee( firstName, lastName, "hr" );
					break;
				case 4:
					emp = new Employee( firstName, lastName, "lg" );
					break;
				default:
					System.out.println( "Incorrect choice" );
					return;
			
			}
			// generate email
			CredentialServices cs = new CredentialServices();
			String email = cs.generateEmailAddress( emp );
			String password = cs.generatePassword();
			cs.showCredentials( emp, email, password );

	}}
