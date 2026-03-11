
public class Employee {
	private int id, salary;
	private String firstName, lastName;
	public Employee(int id, String firstName, String lastName, int salary)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public int getId()
	{
		return this.id;
	}
	public int getSalary()
	{
		return this.salary;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	