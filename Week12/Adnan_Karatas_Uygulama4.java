import java.util.*;
public class Adnan_Karatas_Uygulama4 {

	public static void main(String[] args) {
		String kelime="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Kelime Giriniz=");
		kelime=sc.next();
		
		Terstenkelime(kelime);
	}
        public static void Terstenkelime(String kelime) 
        {
         String ters="";
         for(int yaz=kelime.length();yaz>0;yaz--)
         {
        	ters+=kelime.substring(yaz-1,yaz); 
         }
         System.out.println("Tersten yazılmıs hali = "+ters);
        }
           
}
