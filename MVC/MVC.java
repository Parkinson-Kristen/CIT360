/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafamilycalendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author kjpar
 */
public class MVC {
        String SurName;
	String famMain;
	String firstname;
	String middlename;

	
        
        public String SurName() {
		
		System.out.println("Please input SurName");
		Scanner myVar = new Scanner(System.in);

		SurName = myVar.nextLine();
		//myVar.close();
		return SurName;

	}
	

	
	public String firstname() {
		
		System.out.println("Please input first name");
		Scanner myVar = new Scanner(System.in);
  
		firstname = myVar.nextLine();
		//myVar.close();
	    return firstname;
	}
	
	public String middlename() {
		
		System.out.println("Please input middle name");
		Scanner myVar = new Scanner(System.in);
 
		middlename = myVar.nextLine();
		//myVar.close();
	    return middlename;
	   
	}
	
	public void end(String famMain , String firstname, String middlename, String SurName) {
		
		System.out.println("We added new data to DataBase");
		System.out.println(famMain + " - your firstname, " + firstname + " - your middlename, " + firstname + 
				" - your middlename, " + SurName + " - your SurName.");

	}

}
