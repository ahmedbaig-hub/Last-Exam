import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparaex {
	
class SalaryCompare implements Comparator<Employee> 
{ 
	public int compare(Employee m1, Employee m2) 
	{ 
		if (m1.getSalary() < m2.getSalary()) return -1; 
		if (m1.getSalary() > m2.getSalary()) return 1; 
		else return 0; 
	} 
} 


class NameCompare implements Comparator<Employee> 
{ 
	public int compare(Employee m1, Employee m2) 
	{ 
		return m1.getName().compareTo(m2.getName()); 
	} 
} 



	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>(); 
		list.add(new Employee(50000 , "ahmed", 2015, 34)); 
		list.add(new Employee(60000, "rocky", 1977,28)); 
		list.add(new Employee(70000, "David", 1980,25)); 
		list.add(new Employee(50000, "Frank", 1983,23)); 


		// Sort by rating : (1) Create an object of ratingCompare 
		//				 (2) Call Collections.sort 
		//				 (3) Print Sorted list 
		System.out.println("Sorted by rating"); 
		SalaryCompare SalaryCompare = new SalaryCompare(); 
		Collections.sort(list, SalaryCompare); 
		for (Employee employee: list) 
			System.out.println(employee.getSalary() + " " + 
							employee.getName() + " " + 
							employee.getYear()); 


		// Call overloaded sort method with RatingCompare 
		// (Same three steps as above) 
		System.out.println("\nSorted by name"); 
		NameCompare nameCompare = new NameCompare(); 
		Collections.sort(list, nameCompare); 
		for (Employee employee: list) 
			System.out.println(employee.getName() + " " + 
							employee.getSalary() + " " + 
							employee.getYear()); 

		// Uses Comparable to sort by year 
		System.out.println("\nSorted by year"); 
		Collections.sort(list); 
		for (Employee employee: list) 
			System.out.println(employee.getYear() + " " + 
							employee.getSalary() + " " + 
							employee.getName()+" "); 
	} 


	}


