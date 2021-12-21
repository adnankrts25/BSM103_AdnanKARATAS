import java.util.*;
public class Adnan_Karatas_Uygulama3 {

	public static void main(String[] args) {
		int[] element=new int[5];
		double toplam=0;
		Scanner sc= new Scanner(System.in);
		for(int counter=0;  counter<5; counter++)
		{
		    System.out.print(counter+" "+"sayýyý giriniz=");
			element[counter]=sc.nextInt();
			toplam=toplam+element[counter];
			System.out.println();
			
			
			
		}
		double ort=ortalama(toplam);
		System.out.println("ortalama"+ort);
	}

		public static double ortalama(double toplam) {
		double ortalama=toplam/5;
		return ortalama;
		}
	}


