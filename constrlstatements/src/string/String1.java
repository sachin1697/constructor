package string;

public class String1 {
	static int c=20;
	 
  public static void main(String[]args) {
	  String a="Mom";
	  String b="";
	  for(int x=a.length()-1;x>=0;x--) {
	  b=b+a.charAt(x); 
	  }
	  if(a.equalsIgnoreCase(b)) {
		  System.out.println("given string is palendrome");
	  }
	  else {
		  System.out.println("given is not palendrome");
	  }
	   }
  
  
}
