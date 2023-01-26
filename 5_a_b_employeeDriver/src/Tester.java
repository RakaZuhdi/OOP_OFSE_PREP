
public class Tester {
	
	public static void main(String[] args) {
		Driver driver = new Driver("001", "01", "1");
		System.out.println(driver.getEmp_id());
		System.out.println(driver.getSIM_id());
		System.out.println(driver.getEmp_name());
		
		driver.speak();
	}

}
