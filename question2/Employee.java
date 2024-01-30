import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String position;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void addSubordinate(Employee subordinate) {
        subordinates.add(subordinate);
    }

    public String toString() {
        return "Employee :[ Name : " + name + ", position : " + position + ", salary : " + salary + " ]";
    }
}
