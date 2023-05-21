package practise.oop.task6;

public class Employee {

	private String name;
	private String jobTitle;
	private double salary;

	public Employee(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public void promoteEmployee(double promotion) {
		this.salary += promotion;
	}

	public String getSalary() {
		return "Employee " + this.name + " has salary: " + this.salary;
	}
}