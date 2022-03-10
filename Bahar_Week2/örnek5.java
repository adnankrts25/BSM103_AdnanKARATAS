
public class örnek5 {

	public static void main(String[] args) {
	
		writeBinary(7);

	
	}
	
 public static void writeBinary(int n) {
	 
	 if(n<0)
		  throw new IllegalArgumentException();
	 
	 if(n>=2)
		 writeBinary(n/2);
		 
		 System.out.print(n%2);
 }
	
      public static double sumTo(int n) {
			 
			 if (n<0)
				 throw new IllegalArgumentException();
			 if(n==0)
				 
				 
			return 0.0;
			return n;
			
		 }
	 
 
  }