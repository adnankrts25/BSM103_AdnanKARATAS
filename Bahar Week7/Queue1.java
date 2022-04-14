package odev;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue1  {



		public static void main(String[] args) {
			String data[]= {"java","php","python","C","c++"};
			Queue<String> q=new LinkedList<String>();
			
			for(String word:data)
				q.add(word);
					System.out.println("queue"+q);
					System.out.println(q.peek());
					System.out.println(q.size());


			
			

		}


	}


