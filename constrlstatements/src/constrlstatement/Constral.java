package constrlstatement;

import java.util.Scanner;
//sachin Dattatray Kadam
public class Constral {
	

  public static void main(String[]arge) {
		
		Scanner sc=new Scanner(System.in);

	  int percentage=sc.nextInt();	  
	
       if (percentage>=35 && percentage<=50) {
    	  System.out.println("D");
      }
      else if (percentage>=51 && percentage<=60) {
    	  System.out.println("C");
      }
      else if (percentage>=61 && percentage<=75) {
    	  System.out.println("B");
      }
      else if (percentage>=76 && percentage<=85) {
    	  System.out.println("A");
      }
      else if (percentage>=86  ) {
    	  System.out.println("A+");
      }
      else {
    	  System.out.println("Fail");
      }
      
      }
      }

