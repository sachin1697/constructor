package whileloop;

public class Reverse {
	public static void m2() {
		int a=23457;
		int b=0;
		 while (a!=0) {
			b=b*10+a%10;
			 a=a/10;
		 }
		 System.out.println(b);

	}

}
