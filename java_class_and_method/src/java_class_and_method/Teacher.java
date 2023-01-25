package java_class_and_method;

public class Teacher {
	String name, classNumber;
	int age;
	
	public Teacher(String name, String classNumber, int age) {
		this.name = name;
		this.classNumber = classNumber;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
