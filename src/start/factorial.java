package start;

import java.util.Scanner;
//This method return Factorial
public class fact{
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
