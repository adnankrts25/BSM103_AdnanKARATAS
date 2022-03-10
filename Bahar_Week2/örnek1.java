
public class örnek1 {

	public static void main(String[] args) {
		
	int [] dizi=new int[] {3, 8, 12, 2, 9, 17, 43, 13, 46};
	
	System.out.println(isUnique(dizi));
int [] dizi2=new int[] {3, 8, 12, 2, 12, 17, 43, 13, 46};
	
	System.out.println(isUnique(dizi2));
	
		
	

	}
	
 public static boolean isUnique(int[]dizi) {
	 for(int sayý=0; sayý<dizi.length-1;sayý++) {
		 for(int sayý2=sayý+1; sayý2<dizi.length; sayý2++) {
			 if(dizi[sayý]==dizi[sayý2])
				 return false;
		 }
	 }
	 return true;
	 
 }
  }