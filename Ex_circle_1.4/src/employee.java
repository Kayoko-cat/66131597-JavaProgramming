
public class employee {
	private int id, salary;
	private String firstName, lastName;
	public employee(int id, String firstName, String lastName, int salary)
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
	public String getName()
	{
		String Name = firstName + " " + lastName;
		return Name;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;	
	}
	public int getAnnualSalary()
	{
		return 12 * salary;
	}
	public int raiseSalary(int percent)
	{
		int newSalary = salary + salary * percent / 100;
		return newSalary;
	}
	public String toString()
	{
		String res = "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
		return res;
	}
}