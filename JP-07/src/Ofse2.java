
public class Ofse2 {
	public static void main(String[] args) {
		Animal parrot = new Animal("Parrot") {
			public void Speak() {
				System.out.println("Hello!");
			}
			
			public void Walk() {
			}
		};
		
		parrot.Speak();
	}
	
}
