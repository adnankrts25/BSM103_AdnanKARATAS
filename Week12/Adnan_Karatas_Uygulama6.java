import java.util.Arrays;

public class Adnan_Karatas_Uygulama6 {

	public static void main(String[] args) {
		
		int sayi=0;
		int[] dizi=new int[4];
		sayi=sayi+1;
		metoducalistir(sayi,dizi);
		
		
		
		

	}

	public static void metoducalistir(int sayi,int[]dizi)
	{
	sayi=sayi+1;
	dizi[sayi]=dizi[sayi]+1;
	System.out.println(sayi+" "+Arrays.toString(dizi));
		
		
	}
}
