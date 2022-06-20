package forloop;


public class PrimeNo {
    public static void main(String[]args) {
    for(int x=1;x<=30;x++) {
    	boolean s=false;
    	for(int y=2;y<x;y++) {
    		if(x%y==0) {
    			s=true;
    			break;
    		}
    		if(x%y!=0) {
    			s=false;
    		}
    	}
    	if(s==false) {
    		System.out.print(x+",");
    	}
    }
    }
}