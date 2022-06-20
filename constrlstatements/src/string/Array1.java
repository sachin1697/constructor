package string;

public class Array1 {
     public static void main(String[]args) {
    	 String s="sachin Dattatray kadam";
    	 int y=0;
    	 
    	 int x=0; 
    	 char b=' ';
        while(x<s.length()) {
        	char a=s.charAt(x);
        if(a==b) {
        	y++;
        }
        x++;
        
        } 
       System.out.println(y);
     }
}
