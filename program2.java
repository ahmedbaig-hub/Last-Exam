import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class program2 {

	  
    static Map<String, Integer> map = new HashMap<>(); 
  
    public static void sortbykey() 
    { 
        TreeMap<String, Integer> sorted = new TreeMap<>(map); 
  
        // Display the TreeMap which is naturally sorted 
        for (Map.Entry<String, Integer> entry : sorted.entrySet())  
            System.out.println("Key = " + entry.getKey() +  
                         ", Value = " + entry.getValue());         
    } 
    public static void main(String args[]) 
    { 
        // putting values in the Map 
        map.put("Jay", 10); 
        map.put("Raymon", 20); 
        map.put("Ahmed", 30); 
        map.put("Bally", 40); 
        map.put("Danish", 50); 
  
        
        sortbykey(); 
    } 
} 