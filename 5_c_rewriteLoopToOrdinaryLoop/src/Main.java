import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		String result = "";
		
		for(int i = 0; i < names.size(); i++) {
			if(result.length() > 0) {
				result = result + ", ";
				
			} 
			
			result = result + names.get(i);
			
		}
		
		System.out.println(result);
	
	}
}
