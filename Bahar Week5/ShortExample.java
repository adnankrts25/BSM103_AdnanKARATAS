import java.util.*;
public class ShortExample {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("kalem");
		words.add("silgi");
		words.add("kitap");
		words.add("bart�n");
		words.add("erzurum");
		
		System.out.println("siralanmadan �nce :" +words);
		System.out.println(words.get(0));
		
		Collections.sort(words);
		System.out.println("siralamadan sonra :" +words);
	}

}
