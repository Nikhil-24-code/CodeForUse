//The program helps user to find the factorial of the given number

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
	int i,f=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to find the factorial :");
		int N=s.nextInt();
		for(i=1;i<=N;i++)
		{
			f=f*i;
		}
		System.out.println("factorial of your input is: "+ f);
	}

}
