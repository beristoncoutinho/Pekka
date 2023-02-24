package start;
import java.util.Scanner;
public class factorial {
	Scanner sc = new Scanner(System.in);
	public int factorial() {
		int i=1,fact=1;
		System.out.print("Enter a number ");
		int num = sc.nextInt();
		for (i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		return fact;
		
	}

}
