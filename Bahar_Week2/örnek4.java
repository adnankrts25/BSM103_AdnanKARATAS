
public class örnek4 {

	public static void main(String[] args) {
		System.out.println("Sonuc : "+sumTo(2));

	
	}
	
 public static double sumTo(int n) {
	 
	 if(n<0)
		  throw new IllegalArgumentException();
	 
	 if(n==0)
		 return 0.0;
	 
	 return sumTo(n-1)+1.0/n;
	 
 }
  }