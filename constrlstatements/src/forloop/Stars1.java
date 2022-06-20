package forloop;

public class Stars1 {
  public void m1() {
	  for(int x=10;x>0;x--) {
		  for(int y=0;y<=10;y++) {
			  if(y<x) {
				  System.out.print(" ");
			  }
			  if(y>=x) {
				  System.out.print("* ");
			  }
		  }
		  System.out.println();
	  }
  }
  public static void main(String[]args) {
	  Stars1 obj1=new Stars1();
	  obj1.m1();
  }
}
