
public class örnek2 {

	public static void main(String[] args) {
		
	double [] dizi=new double[] {3.1, 8.7, 12.5, 2.9,};
	
	System.out.println(isSorted(dizi));

	
		
	

	}
	
 public static boolean isSorted(double[]dizi) {
	 for(int sayý=0; sayý<dizi.length-1;sayý++) {
		 if(dizi[sayý]>dizi[sayý+1])
		 return false;
		 
	 }
	 return true;
	 
 }
  }