
public class �rnek1 {

	public static void main(String[] args) {
		
	int [] dizi=new int[] {3, 8, 12, 2, 9, 17, 43, 13, 46};
	
	System.out.println(isUnique(dizi));
int [] dizi2=new int[] {3, 8, 12, 2, 12, 17, 43, 13, 46};
	
	System.out.println(isUnique(dizi2));
	
		
	

	}
	
 public static boolean isUnique(int[]dizi) {
	 for(int say�=0; say�<dizi.length-1;say�++) {
		 for(int say�2=say�+1; say�2<dizi.length; say�2++) {
			 if(dizi[say�]==dizi[say�2])
				 return false;
		 }
	 }
	 return true;
	 
 }
  }