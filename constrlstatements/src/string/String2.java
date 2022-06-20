package string;

public class String2 {
  public static void main(String[]args) {
	  String a="sachin kadam";
	  int b=0;
	  char d=' ';
	  char c=' ';
	  for(int x=0;x<a.length();x++) {
		  c=a.charAt(x);
		  if(c==d) {
			  b++;
		  }
	  }
	  	System.out.println(b); 
	  	char[] z=a.toCharArray();
	  	System.out.println(z);
  }
  
}
