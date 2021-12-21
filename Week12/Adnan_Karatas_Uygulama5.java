import java.util.Scanner;

public class Adnan_Karatas_Uygulama5 {

	public static void main(String[] args) {
		String kelime="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Kelime Giriniz=");
		kelime=sc.next();
		System.out.println("Kaça bölünsün");
		int bol=sc.nextInt();
		
		bolerekyaz(kelime,bol);
	}
	public static void bolerekyaz(String kelime , int bol)
	{
		int harfinsirasi=0;
		for(int harf=0;harf<kelime.length()/bol;harf++)
		{
			System.out.println(kelime.substring(harf,harf+bol));
			
			harfinsirasi+=harf;
			
		}	
		System.out.println(kelime.substring(harfinsirasi+bol,kelime.length()));
		
	}
}
