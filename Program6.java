import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Program6 {

  public static void main(String[] args) {
		    LinkedList<String> linkedlist = new LinkedList<String>();
		    linkedlist.add("Ahmed");
		    linkedlist.add("Harry");
		    linkedlist.add("Tommy");
		    linkedlist.add("Rammy");
		    linkedlist.add("Rachel");

		    List<String> list = new ArrayList<String>(linkedlist);

		    for (String str : list){
		      System.out.println(str);
		    }
		 }
		}