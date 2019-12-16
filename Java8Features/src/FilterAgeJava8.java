import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Employee {

	private int employeeId;
	private String employeeName;
	private int age;
	private double salary;

	public Employee(int employeeId, String employeeName, int age, double salary) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class FilterAgeJava8 {

	public static void main(String[] args) {

		Employee employee1 = new Employee(1, "John", 25, 100000.00);
		Employee employee2 = new Employee(2, "Jack", 22, 90000.00);
		Employee employee3 = new Employee(3, "Laura", 38, 120000.00);
		Employee employee4 = new Employee(4, "Smith", 28, 90000.00);

		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);

		Stream<Employee> stream = employees.stream().filter(e -> e.getAge() < 30);
		stream.forEach(e1 -> System.out.println(
				e1.getEmployeeId() + "\t" + e1.getEmployeeName() + "\t" + e1.getAge() + "\t" + e1.getSalary()));

		Double TotalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println("Total Salary : "+TotalSalary);
	}

}
