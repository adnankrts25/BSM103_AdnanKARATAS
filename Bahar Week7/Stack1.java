package odev;

import java.util.*;
public class Stack1 {
	

		public static void main(String[] args) {
			int data [] = {18,4,3,5,2};
			Stack<Integer> s= new Stack<Integer>();
			for(int d:data)
				s.push(d);
			
			System.out.println("Stack "+s);
			System.out.println(s.peek());
			System.out.println(s.size());



	}

}
