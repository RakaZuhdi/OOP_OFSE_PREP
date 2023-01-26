import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Raka");
		names.add("Diva");
		names.add("Bayu");
		
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}

}
