import java.util.Iterator;
import java.util.PriorityQueue;

public class Program15 {

public static void main(String args[]){
		
	    PriorityQueue<String> queue=new PriorityQueue<String>();
	    // creating priority queue
	    queue.add("Amit");
	    // adding elements
	    queue.add("Rachit");
	    queue.add("Rahul");
	    System.out.println(queue);
	    System.out.println("head:"+queue.element());
	    System.out.println("head:"+queue.peek());
	    System.out.println("iterating the queue elements:");
	    Iterator itr=queue.iterator();
	    while(itr.hasNext()){
	      System.out.println(itr.next());
	    }
	    queue.remove();
	    queue.poll();
	    System.out.println("after removing two elements:");
	    Iterator itr2=queue.iterator();
	    while(itr2.hasNext()){
	      System.out.println(itr2.next());
	     queue.add("amit");
	     queue.add("rachit");
	     System.out.println("after adding two elements:");
	     Iterator itr3= queue.iterator();
	     while(itr3.hasNext()) {
	    	 System.out.println(itr3.next());
	     }
	     
	    }
	  }

	}
