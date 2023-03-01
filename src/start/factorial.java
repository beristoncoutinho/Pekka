package start;

import java.util.Scanner;
//This method return Factorial
public class fact{
	Scanner sc = new Scanner(System.in);
	public int factorial() {
		int f=1;
		System.out.print("Enter a number ");
		int num = sc.nextInt();
		for (int i=1;i<=num;i++) {
			f=f*i;
			
		}
		return f;
		
	}

}
