package Pascalstriangle;

public class ptri {
	
	//

	public int factorial(int i) {
	    if (i == 0) {
	        return 1;
	    }
	    return i * factorial(i - 1);
	}
	
	private void printUseRecursion(int n) {
	    for (int i = 0; i <= n; i++) {
	        for (int j = 0; j <= n - i; j++) {
	            System.out.print(" ");
	        }

	        for (int k = 0; k <= i; k++) {
	            System.out.print(" " + factorial(i) / (factorial(i - k) * factorial(k)));
	        }

	        System.out.println();
	    }
	}
	
	public static void main(String [] args) {
		ptri n = new ptri();
		n.printUseRecursion(5);
	}
}
