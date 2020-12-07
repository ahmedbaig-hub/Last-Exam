import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Program1 {

	public static void main(String[] arguments) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "billy");
		hmap.put(2, "coco");
		
		Iterator<Entry<Integer, String>> it = hmap.entrySet().iterator();
	 System.out.println(hmap);
	 System.out.println("after iterarion:");
		while (it.hasNext()) {
			Map.Entry<Integer, String> set = (Map.Entry<Integer, String>) it.next();
			System.out.println(set.getKey() + " = " + set.getValue());
		}
	}
}