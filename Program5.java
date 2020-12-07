import java.util.ArrayList;
import java.util.Arrays;

public class Program5 {

  public static void main(String[] args) 
			    {
 ArrayList<String> List = new ArrayList<String>(Arrays.asList( "Ahmed", "Lily", "Cynthia") );
			         
	System.out.println(List);  
			        
			        List.remove(0);
			        
			         System.out.println("after removing element:");
			         System.out.println(List);
			          
			    }
		}
