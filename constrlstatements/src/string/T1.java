package string;

public class T1 {
	public static void m5(int x, int y) {
		int c=x+y;
		System.out.println(c);
	}
	public static void main(String[]args) {
	int a=2;
	int b=1;
	boolean run=true;
	
	while(run) {
		a++;
		if(a>10) {
			run=false;			
		}
		m5(b,1);
		b++;
	}
	}
}
