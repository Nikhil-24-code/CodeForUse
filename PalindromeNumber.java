//Palindrome number check through a function
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
		System.out.println("Enter your number to verfy whether the umber is Palindrome or not :");
		int N=s.nextInt();
		Palindrome ob=new Palindrome();
		boolean b= ob.call(N);
		if (b==true)
			System.out.println("The number you entered is Palindrome");
		else 
			System.out.println("Your number is not Palindrome");
		
	

	}
static boolean call(int n)
{
	int pal=n;
	int d, s=0;
	while(n!=0)
	{
		d=n%10;
		s=(s*10)+d;
		n=n/10;
	}
	if (pal==s)
		return true;
	else
		return false;
}
}
