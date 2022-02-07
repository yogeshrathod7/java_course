package Training_Java;

public class Employee {
	
	int employeeId;
	String firstName;
	String lastName;
	
	public Employee(int employeeId,String firstName,String lastname) {
		this.employeeId=employeeId;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public void display() {
		System.out.println("calling from employee class :");
		System.out.println("Employee Id "+ employeeId);
		System.out.println("firstName "+ firstName);
		System.out.println("lastName "+ lastName);
	}

}
