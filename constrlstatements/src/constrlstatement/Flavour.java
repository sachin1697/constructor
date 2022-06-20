package constrlstatement;

public class Flavour {
	public static void main(String[]arge) {
		String flavour="Vanilla";
				
      if (flavour.equals("Strawberry")) {
    	  System.out.println("Prise of Strawberry cake is Rs.210");    	  
      }
      else if (flavour.equals("Chocolate")) {
    	  System.out.println("Prise of Chocolate cake is Rs.300 ");    	  
      }
      else if (flavour.equals("Chocolate Raspberry")) {
    	  System.out.println("Prise of Raspberry cake is Rs.350");
    }
      else if (flavour.equals("Vanilla")) {
    	  System.out.println("Prise of Vanilla cake is Rs.360");
    }
      else{
    	  System.out.println("not avlable");
      }
	}

}
