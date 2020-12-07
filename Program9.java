public class Program9 implements Comparable<Program9> {
 
    private int id = -1;
    private String firstName = null;
    private String lastName = null;
    private int age = -1;
 
    public Program9(int id, String fName, String lName, int age) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }
 
    @Override
    public int compareTo(Program9 o) {
        return this.id - o.id;
    }
 
    // Setters and Getters
 
    @Override
    public String toString() {
        return "Employee : " + id + " - " + firstName + " - " + lastName + " - " + age + "\n";
    }
}