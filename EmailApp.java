package com.genEmails;

//Generate an email with following syntax: firstname.lastname@department.company.com
//Determine the department(sales, development, accounting), if none leave blank
//Generate a random String for a password
// have set methods to change the password, set mailbox capacity, define alternate email
// have a get methods to display name, email, and mailbox capactiy

public class EmailApp {
	public static void main (String[]args) {
		Email em1 = new Email("John" , "Smith");
		
		System.out.println(em1.showInfo());
		
	}

}
