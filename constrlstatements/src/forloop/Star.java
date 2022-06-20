package forloop;

public class Star {
	public static void main(String[]args) {
		int a=1;
      for(int x=10;x>0;x--) {
    	  int b=1;
    	  for(int y=0;y<=10;y++) {
    		  if(y<x) {
    			  System.out.print(" ");
    		  }
    		  if(y>=x) {
    			  if(a%2==1) {
    				  System.out.print(b+" ");
    				  b++;
    			  }
    			  else if(a%2==0) {
    				  System.out.print("# ");
    			  }
    		  }
    	  }
    	  a++;
    	  System.out.println();
      }
	}}