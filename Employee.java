import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {
    private int Salary ;
    private String Name ;
    private int year ;
    private int age ;
 
    public Employee(int Salary, String Name, int year, int age) {
        this.Salary = Salary;
        this.Name = Name;
        this.year = year;
        this.age = age;
    }
    public int getage() { return age; } 
	public String getName() { return Name; } 
	public int getYear()	 { return year; } 
	public int getSalary()	 { return Salary; }
	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return 0;
	} 

}