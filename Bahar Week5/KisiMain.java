import java.util.*;
public class KisiMain {

	public static void main(String[] args) {
		
		
		ArrayList<Kisi> bireyler = new ArrayList<>();
		bireyler.add(new Kisi("�mit", 22));
		bireyler.add(new Kisi("�smail", 20));
		bireyler.add(new Kisi("Umut", 21));
		bireyler.add(new Kisi("Mehmet", 20));
		
		for (Kisi birey: bireyler) {
			
			System.out.println(" isim :" +birey.getIsim()+ " yas :" +birey.getYas());
		
		}

	}

}
