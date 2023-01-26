
public class Main {
	
	public static void main(String[] args) {
		double[] A = new double[15];
		double[] B = new double[2 * A.length];
		
		double n = 0;
		for(double d : A) d = n++;
		
		for(int i = 0; i < A.length; i++) {
			B[i] = A[i];
		}
		
		for(double d: B) System.out.println(d);
		
		
	}
}
