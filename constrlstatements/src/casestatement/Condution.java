package casestatement;

import java.util.Scanner;

//import whileloop.Constructor;

public class Condution {
public static void main(String[]args) {
		
		//System.out.println("MAin start");
		String s=null;
		int x=2;
		int y=1;
		

		try {
			//System.out.println("inside catch block");
			//System.out.println(s.equals("Hi"));
			System.out.println(x+y);
		}
		
		catch (Exception e) {
			System.out.println(x*y);
			//System.out.println(e.getClass());
		}
		
		finally {
			//clean up code
			System.out.println("Finally block");
		}
		//System.out.println("In Main methods");
		
		

	}
}
