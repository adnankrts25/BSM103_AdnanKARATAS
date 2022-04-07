package odev;

import java.util.*;


public class Sets {

	public static void main(String[] args) {
		
		ArrayList<String> lists= new ArrayList<String>();
		 
		lists.add("kalem");
		lists.add("masa");
		lists.add("defter");
		lists.add("bilgisayar");
		lists.add(3,"dolap");
		lists.add("kalem");
		lists.add("masa");
		lists.add("defter");
		
		System.out.println(lists);
		
		Set<String> sets = new HashSet<String>();
		
		sets.add("kalem");
		sets.add("masa");
		sets.add("defter");
		sets.add("bilgisayar");
		sets.add("kalem");
		sets.add("masa");
		sets.add("defter");
		
		System.out.println(sets);
		System.out.println(sets.size());
		System.out.println(sets.contains("dolap"));
		
		sets.clear();
		System.out.println(sets);
		sets.addAll(lists);
		
		System.out.println(sets);
		System.out.println(lists.get(2));
		
		
	}

}
