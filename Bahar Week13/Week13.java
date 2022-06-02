import java.util.*;
import java.io.*;

public class Week13 {
	


	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(countWords("kalem"));
		

	}
	public static int countWords( String searchedword) throws  FileNotFoundException{
		Scanner girdi=new Scanner(new File("test.txt"));
		
		List<String> words =new ArrayList<String>();
		
		while (girdi.hasNext()) {
			String word =girdi.nextLine();
			words.add(word);
			
			
		}
		for(int index = 0; index<words.size();index++) {
			
		
			if(words.get(index).equals(searchedword)) {
				return index;
			}
			}
		return -1;

}
}