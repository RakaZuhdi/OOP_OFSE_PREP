
public class Main {
	public static void main(String[] args) {
		int[] A = new int[5];
		int[] B = new int[5];
		
		for(int i = 0; i < 5; i++) {
			A[i] = 2 * i + 1;
			System.out.println(A[i]);
		}
		
		for(int i = 0; i < B.length; i++) {
			B[i] = A[A.length - i - 1];
			System.out.println(B[i]);
		}
	}

}
