
public class Ofse2 {
	public static void main(String[] args) {
		Animal parrot = new Animal("Parrot") {
			public void speak(){
				System.out.println("Aaarrgghh");
			}
		};
		
		parrot.speak();
		
		Owl owl = new Owl("Owl");
		owl.speak();
	}

}
