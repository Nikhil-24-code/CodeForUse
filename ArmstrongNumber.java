//To check whether the number is Armstrong or not
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your number to verfy whether the number is an Armstrong number or not :");
		int N=s.nextInt();
		Armstrong ob=new Armstrong();
		boolean b= ob.function(N);
		if (b==true)
			System.out.println("Wow...! Great!! The number you entered is an Armstrong number");
		else 
			System.out.println("OOPs your number is not an Armstrong number");

	}
	boolean function(int n)
	{
		int arm=n;
	    int d,s=0;
	    while(n!=0)
	    {
	    	d=n%10;
	    	s=s+(d*d*d);
	    	n=n/10;
	    }
	    if(arm==s)
	    	return true;
	    else
	    	return false;
	
	}

}
