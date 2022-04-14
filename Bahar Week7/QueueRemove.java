package odev;
import java.util.*;

public class QueueRemove {


		public static void main(String[] args) {
			int data [] = {18,4,3,5,2};
			
			Queue<Integer>q=new LinkedList<Integer>();
			for(int d:data)
				q.add(d);
			
			System.out.println("queue"+q);
			removeAll(q,4);
				

		}
		public static void removeAll(Queue<Integer> q,int value) {
			int size = q.size();
			for(int i=0; i<size;i++) {
				int n=q.remove();
				System.out.println(n+ "elemaný çýkartýldý");
				System.out.println("Current queue"+q);
				if(n!=value) {
					q.add(n);
					System.out.println(n+ "elemaný eklendi");
				}
			}
			

				}
			
		}



