
public class �rnek2 {

	public static void main(String[] args) {
		
	double [] dizi=new double[] {3.1, 8.7, 12.5, 2.9,};
	
	System.out.println(isSorted(dizi));

	
		
	

	}
	
 public static boolean isSorted(double[]dizi) {
	 for(int say�=0; say�<dizi.length-1;say�++) {
		 if(dizi[say�]>dizi[say�+1])
		 return false;
		 
	 }
	 return true;
	 
 }
  }