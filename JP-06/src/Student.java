
public class Student {
	public String std_id;
	public String std_nm;
	
	public Student() {
		std_id = "001";
		std_nm = "Cay Horstmann";
	}
	
	public void Speak() {
		System.out.println("Default!");
	}
	
	public void Speak(String words) {
		System.out.println(words);
	}

}
