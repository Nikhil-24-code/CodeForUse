// This is a programto swap 2 variables without using a 3rd variable


import java.util.*;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value for a");
		int a=s.nextInt();
		System.out.println("Enter value for b");
		int b=s.nextInt();
		System.out.println("The value of variable a and b before swapping \na:"+a+" b:"+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("The value of variable a and b after swapping \na:"+a+" b:"+b);

	}
}
