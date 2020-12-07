import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program9ex {

	    public static void main(String[] args) {
	        Program9 e1 = new Program9(1, "aTestName", "dLastName", 34);
	        Program9 e2 = new Program9(2, "nTestName", "pLastName", 30);
	        Program9 e3 = new Program9(3, "kTestName", "sLastName", 31);
	        Program9 e4 = new Program9(4, "dTestName", "zLastName", 25);
	 
	        List<Program9> employees = new ArrayList<Program9>();
	        employees.add(e2);
	        employees.add(e3);
	        employees.add(e1);
	        employees.add(e4);
	 
	        // UnSorted List
	        System.out.println(employees);
	 
	        Collections.sort(employees);
	 
	        // Default Sorting by employee id
	        System.out.println(employees);
	    }
	}