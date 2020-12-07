import java.util.ArrayList;
import java.util.Arrays;

public class Program4 {


		  public static void main(String[] args) 
		    {
		        ArrayList<String> List = new ArrayList<String>(Arrays.asList( "Ahmed", "Lily", "Cynthia") );
		         
		        System.out.println(List);  
		        
		        List.add(0, "Frank");
		         System.out.println("after adding element:"+ List);
		          
		    }
	}
