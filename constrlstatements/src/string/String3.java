package string;

import java.util.Arrays;

public class String3 {
     public static void main(String[]args) {
    	 
    	 String a="eat";
    	 String b="ate";
    	 /*boolean z=false;
    	 if(a.length()==b.length()) {
    		 for(int x=0;x<a.length();x++) {
    			 char c=a.charAt(x);
    			 //String p=c;
    			 /*for(int y=0;y<b.length();y++) {
    				 char d=b.charAt(y);
    				 if(c==d) {
    					z=true;
    					break;
    				 }
    			 }
    			 if(b.contains("e")) {
    				 
    			 }
    			 System.out.println(a.charAt(x));
    		 }
    		 if(z) {
    			 System.out.println("given is anagram");
    		 }
    	 }
    	 else {
    		 System.out.println("given is not anagram");
    	 }*/
    	char[] s=a.toCharArray();
    	
    	char[] t=b.toCharArray();
    	if(Arrays.equals(s, t)) {
    		System.out.println("this are same arrays");
    	}
     }
}
