package odev;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Maps {

	public static void main(String[] args) {
		
    
		Map<Integer, String> citys= new TreeMap<Integer, String>();
		
		citys.put(25, "Erzurum");
		citys.put(01, "Adana");
		citys.put(02, "Adýyaman");
		citys.put(06, "Ankara");
		citys.put(65, "Van");
		
		System.out.println(citys);
		System.out.println("Ýndeksler - Keys" +citys.keySet());
		System.out.println(citys.values());
		System.out.println(citys.get(65));
		
		Map<Integer,Set<String>> citys2= new HashMap<Integer, Set<String>>();
		citys2.put(65, new TreeSet<String>());
		citys2.get(65).add("Van");
		citys2.get(65).add("Ercis");
		citys2.get(65).add("Edremit");
		
		citys2.put(02,new TreeSet<String>());
		citys2.get(02).add("Adýyaman");
		citys2.get(02).add("Gölbasý");
		citys2.get(02).add("Sincik");
		System.out.println(citys2);
		
		
	}

}
