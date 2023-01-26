
public class Driver extends Employee implements Human{
	public String SIM_id;

	public Driver(String emp_id, String emp_name, String SIM_id) {
		super(emp_id, emp_name);
		this.SIM_id = SIM_id;
	}
	
	public String getSIM_id() {
		return this.SIM_id;
	} 
	
	public void speak() {
		System.out.println("Hello, there!");
	}
	
}
