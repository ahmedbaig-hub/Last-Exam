import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Compex {

	public static void main(String[] args) 
	{ 
		ArrayList<Employee> list = new ArrayList<Employee>(); 
		list.add(new Employee(50000 , "ahmed", 2015, 34)); 
		list.add(new Employee(60000, "rocky", 1977,28)); 
		list.add(new Employee(70000, "David", 1980,25)); 
		list.add(new Employee(50000, "Frank", 1983,23)); 

		Collections.sort(list);
		
	System.out.println("Movies after sorting : "); 
	for (Employee employee: list) 
	{ 
		System.out.println(employee.getName() + " " + 
						employee.getSalary() + " " + 
						employee.getYear()+" "+employee.getage()); 
		
	} 
} 
} 



