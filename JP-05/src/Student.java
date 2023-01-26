
public class Student {
	private String std_id;
	private String std_nm;
	
	public Student() {
		std_id= "001";
		std_nm = "Cay Horstmann";
	}

	public String getStd_id() {
		return std_id;
	}

	public void setStd_id(String std_id) {
		this.std_id = std_id;
	}

	public String getStd_nm() {
		return std_nm;
	}

	public void setStd_nm(String std_nm) {
		this.std_nm = std_nm;
	}
	
	public void Speak() {
		System.out.println("Not overrided!");
	}
	
	public void Speak(String words) {
		System.out.println(words);
	}
	
	
	

}
