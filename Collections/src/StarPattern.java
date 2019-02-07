import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {

		int i, j, k;
		for (i = 5; i >= 1; i--) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("_____________");
		
		
		for( i=0;i<5;i++) {
			for(j=0;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println("_____________");
		
		
		
		for( i=5;i>=1;i--) {
			for( j=1;j<i;j++) {
				System.out.print(" ");
				
			}
			for(int x=5;x>=i;x--) {
				System.out.print("*");
			}
			System.out.println();
			
			
			
		}
	}

}
