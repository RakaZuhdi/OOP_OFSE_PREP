
public class Main {
	public static void main(String[] args) {
		int[] A = new int[5];
		int[] B = new int[5];
		
		
		for(int i = 0; i < A.length; i++) {
			A[i] = i+1;
		}
		
		for(int a : A) {
			System.out.println(a);
		}
		
		for(int j = 0; j < B.length; j++) {
			B[j] = A[A.length - j - 1];
			
			System.out.println(B[j]);
		}
	}

}
