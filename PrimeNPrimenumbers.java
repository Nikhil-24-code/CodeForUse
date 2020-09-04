//This program check for the condition as per choice whether the number is prime or the prime numbers till Nth number entered by user

import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Helllo..!! We will help you to find the prime number of your choice or we can find the prime numbers till the entry you make\n ");
		Scanner s=new Scanner(System.in);
		System.out.println("Press 1: To check whether the number is prime or not \n\nPress 2: To show the prime numbers till your entry"); 
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println("Please enter your number:");
			int N=s.nextInt();
			int c=0,i;
			for(i=1;i<=N;i++)
			{
				if((N%i)==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println("Yes the number you entered is a Prime number");
			}
			else
				System.out.println("No the number you entered is not a Prime number");	
		}
		break;
		 
		case 2:
		{
	     	int i,j;
		String primenumbers="";
		System.out.println("Please enter your range for prime numbers:");
		int N=s.nextInt();
		for(i=1;i<=N;i++)
		{
			int c=0;
			for(j=i;j>=1;j--)
			{
				if((i%j)==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				primenumbers = primenumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to " + N +" are :");
	       System.out.println(primenumbers);
		}
		break;
		}
		

}
}
