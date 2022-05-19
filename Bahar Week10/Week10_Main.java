
public class Week10_Main {

	public static void main(String[] args) {
		LinkedIntList linklist = new LinkedIntList();
		
		linklist.add(5);
		linklist.add(10);
		
		System.out.println(linklist.toString());
		System.out.println(linklist.indexof(5));
		
		linklist.remove(0);
		System.out.println(linklist.toString());
		
		linklist.Add(0, 12);
		linklist.Add(1, 9);
		linklist.Add(3, 3);
		 
		System.out.println(linklist.toString());
	    System.out.println(linklist.size());
	
	}

}
