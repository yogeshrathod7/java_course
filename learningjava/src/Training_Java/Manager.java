package Training_Java;

public class Manager extends Employee {
	
	int managerId;
	public Manager(int employeeId,String firstNmae,String lastName) {
		super(employeeId,firstNmae,lastName);
		this.managerId=managerId;
	}
	
	public void display() {
		super.display();
		System.out.println("manager Id " + this.managerId);
	}

}
