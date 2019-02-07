import java.util.Scanner;

public class FloydTriangle {

	public static void main(String... args) {

		int n, c,d;
		int num =1;
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of rows");
		n= s.nextInt();
		System.out.println("Floyds triangle is :-");
		
		for( c=1;c<=n;c++) {
			
			for(d=1;d<=c;d++)
			{
				
				System.out.print(num + " ");
				num++;
				
			}
			System.out.println();
			
		}
		
		
		
		
	}

}
