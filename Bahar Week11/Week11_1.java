package odev;

import java.util.*;

public class Week11_1 {

	public static void main(String[] args) {
     Stack<Character> s= new Stack<Character>();
		
		Stack<Character> d= new Stack<Character>();
		if (validPalindrome("tnt")) {
			System.out.println("palindromedur");
		}
		else 
		{
			System.out.println("palindrome deðildir");
		}
		
	
			
	}
	public static boolean validPalindrome(String str) {
		Stack<Character>s=new Stack<Character>();
		Stack<Character>s2=new Stack<Character>();

		for(char x : str.toCharArray()) {
			s.push(x);
		}
		for(int i =0; i<str.length()/2;i++) {
			s2.push(s.pop());
		}
		if(str.length()%2!=0) s.pop();
		return s.equals(s2);

	
	}

}


