package whileloop;

   public class Constructor {
	
		
		String name;
		char div;
		int rollNo;
		
		//constructor of class
		public Constructor(String n,char c,int r) {
			this.name=n;
			this.div=c;
			this.rollNo=r;
			
			System.out.println(c);
		}
		public void m1() {
			System.out.println("rollNo");
		}

		
		static public void main(String[] args) {
			
			Reverse.m2();
			Constructor var=new Constructor("Sachin", 'A', 10);
			Constructor obj2=new Constructor("sachin",'B',20);
	       	   
	       
		}
	}

