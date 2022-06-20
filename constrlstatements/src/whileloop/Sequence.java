package whileloop;
import java.util.Scanner;

public class Sequence {
	public static void main(String[]arge) {
		
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of x");
			int x=sc.nextInt();
			
			int y=0;
			int a=0;
			while (x>0) {
			y=x%10;
			x=x/10;
			a=a+y;
				}
			System.out.println(a);
	}

}
