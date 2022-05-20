
import java.util.*;

public class PalindromeQueue {

	public static void main(String[] args) {
		System.out.println("L�tfen bir kelime giriniz:");
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		
		Queue queue = new LinkedList();
		
		for (int index = inputString.length()-1;index >= 0; index--) {
			queue.add(inputString.charAt(index));
		}
		String reverseString="";
		while ( !queue.isEmpty()) {
			reverseString = reverseString + queue.remove();
			
		}
		if (inputString.equals(reverseString)) {
			System.out.println("Girilen kelime polindromdur");
		}else {
			System.out.println("Girilen kelime polindrum de�ildir");
		}

	}

}
