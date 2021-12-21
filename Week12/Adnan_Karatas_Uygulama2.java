import java.util.Scanner;

public class Adnan_Karatas_Uygulama2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("vize notunu giriniz: ");

		int vizenotu=sc.nextInt();
		System.out.print("final notunu giriniz: ");

		int finalnotu =sc.nextInt();
		if((vizenotu>=0 && vizenotu<=100)&&(finalnotu>=0 && finalnotu<=100)) {
		
	    notlarigoster(vizenotu,finalnotu);
	    System.out.println("ortalama="+ortalama(vizenotu,finalnotu));}
		else
		System.out.println("hatalý not girildi");
	    

		}
		
	    public static void notlarigoster(int vizenotu, int finalnotu) {
	    	System.out.println("vize notu:"+vizenotu);
	    	System.out.println("final notu:"+finalnotu);
	    	
	    }
	    public static double ortalama(int vizenotu,int finalnotu) {
	    	double ortalama=(vizenotu*0.4)+(finalnotu*0.6);
	    	return ortalama;
	    }
	    
	}


