
public class ExchangeStudent extends Student{
	private String exhange_std_id;

	public ExchangeStudent() {
		super();
		this.exhange_std_id = "01";
	}

	public String getExhange_std_id() {
		return exhange_std_id;
	}

	public void setExhange_std_id(String exhange_std_id) {
		this.exhange_std_id = exhange_std_id;
	}
	
	public void Speak(){
		System.out.println("Overrrided!");
	}
	
	

}
