package odev;
 import java.util.*;
 
public class Stutter {

	public static void main(String[] args) {
		
	
				int data [] = {18,4,3,5,2};
				Stack<Integer>s=new Stack<Integer>();
				Queue <Integer> q= new LinkedList<Integer>();
				for(int n:data)
					q.add(n);
				for(int n:data)
					s.push(n);
				System.out.println(q);
				stutter(q);
				System.out.println(q);
				
				System.out.println("-----------");
				System.out.println(s);
				System.out.println(s.size());
				stutter2(s);
				System.out.println(s);
				
				


			}
			public static void stutter(Queue<Integer>q) {
				int size=q.size();
				System.out.println(size);
				while(size>0) {
					int temp=q.remove();
					q.add(temp);
					q.add(temp);
					size--;
				}
					
				
					
				
			}
				public  static void stutter2(Stack<Integer> s) {
					Stack<Integer>backup=new Stack<Integer>();
					int size=s.size();
					System.out.println(size);
					while(size>0) {
						int temp=s.peek();
						backup.push(temp);
						backup.push(temp);
						s.pop();
						size--;

				}
					
						System.out.println(backup);
						System.out.println(backup.peek());
					}
				   
				    

			}


		

	


