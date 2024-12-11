package Java2.Lab;


public class Employee {
	private int id;
	private String name;
	private String department;
	private String dateOfJoining;
	
	public Employee() {
		this.id = 0;
		this.name = "#";
		this.department = "#";
		this.dateOfJoining = "#";
	}
	
	public Employee(int id, String name, String dept, String dateOfJoining) {
		this.id = id;
		this.name = name;
		this.department = dept;
		this.dateOfJoining = dateOfJoining;
	}
	
	public void setId( int id) {
		this.id = id;
	}
	public void setName( String name) {
		this.name = name;
	}
	public void setDepartment( String department) {
		this.department = department;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return department;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	
	@Override
	
	public String toString() {
		return "Employee ID: " + id + "\n" +
	               "Name: " + name + "\n" +
	               "Department: " + department;
	}
}

