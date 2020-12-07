import java.util.ArrayList;
import java.util.Collections;

public class Program3 {

	public static void main(String args[]){
		   ArrayList<String> arraylist = new ArrayList<String>();
		   arraylist.add("A");
		   arraylist.add("B");
		   arraylist.add("C");
		   arraylist.add("D");

		   
		   System.out.println("Before Sorting:");
		   for(String str: arraylist){
				System.out.println(str);
			}

		   
		   Collections.sort(arraylist, Collections.reverseOrder());

		   
		   System.out.println("ArrayList in descending order:");
		   for(String str: arraylist){
				System.out.println(str);
			}
		}
	}