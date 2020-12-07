import java.util.HashSet;

public class Program7 {

	  public static void main(String[] args) {
		    
		     HashSet<String> hset = new HashSet<String>();
		 
		     hset.add("Ahmed");
		     hset.add("Larry");
		     hset.add("Sammuel");
		     hset.add("Frida");
		 
		     System.out.println("HashSet contains: "+ hset);
		 
		     String[] array = new String[hset.size()];
		     hset.toArray(array);
		 
		     System.out.println("conversion to Array: ");
		     for(String str : array){
		        System.out.println(str);
		     }
		  }
		}