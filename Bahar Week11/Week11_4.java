package odev;

import java.util.*;
public class Week11_4 {
	


	public static void main(String[] args) {
		System.out.println(fibonacciSeries(6));

	     
		

	}
	public static List<List<Integer>> fibonacciSeries(int numOfRows){
		List<List<Integer>> List=new ArrayList<>();
		for(int i=0;i<numOfRows;i++) {
			List.add(new ArrayList<Integer>());
		
	}
		List.get(0).add(1);
		List.get(1).add(1);
		int med;
		for(int i =2; i<numOfRows;i++) {
			for(int j=0; j<2; j++) {
				med=0;
				for(int size=0; size<List.get(i-(2-j)).size(); size++) {
					med+= List.get(i-(2-j)).get(size);
				}
				List.get(i).add(med);
				
			}
		}

		
		
		return List;


}
}
