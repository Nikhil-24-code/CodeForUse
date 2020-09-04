//This code executes area of the figures like square, rectangle, circle, traingle

import java.util.*;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome.. This code will help you find area of circle, rectangle,square,triangle");
		Scanner s=new Scanner(System.in);
		System.out.println("Press 1: To find the area of the Rectangle\nPress 2: To find the area of the Circle\nPress 3: To find the area of the Square\nPress 4: To find the area of the Triangle");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println("Alright we see you want to find the area of Rectangle\n");
			System.out.println("Enter the length and breadth of your Rectangle");
			double length=s.nextDouble();
			double breadth=s.nextDouble();
			double Area=length*breadth;
			System.out.println("Area of the Rectangle: "+Area);
			
			
		}break;
		
		case 2:
		{
			System.out.println("Alright we see you want to find the area of Circle\n");
			System.out.println("Enter the radius of your circle");
			double radius=s.nextDouble();
			final double pi = 3.14;
			double Area= (radius* radius *pi);
			System.out.println("Area of the Circle: "+Area);
			
		}break;
		
		case 3:
		{
			System.out.println("Alright we see you want to find the area of Square\n");
			System.out.println("Enter the side of your Square");
			double side=s.nextDouble();
			double Area= side*side;
			System.out.println("Area of the Square: "+Area);
			
		}break;
		 
		case 4:
		{
			System.out.println("Alright we see you want to find the area of Triangle\n");
			System.out.println("Please Press 1 for right angle triangele\nPress 2: for equilateral triangle");
			int option=s.nextInt();
			if(option==1)
			{
				System.out.println("Enter the hypotenous of your Triangle");
				double hyp=s.nextDouble();
				System.out.println("Enter the base of your Triangle");
				double base=s.nextDouble();
				double Area=0.5*base*hyp;
				System.out.println("Area of the Triangle: "+Area);
				
			}
			else if (option==2)
			{
				System.out.println("Enter the sides of your Triangle");
				double s1=s.nextDouble();
				double s2=s.nextDouble();
				double s3=s.nextDouble();
				int f=(int)(s1+s2+s3)/2;
				double tot=(f*(f-s1)*(f-s2)*(f-s3));
				double Area=Math.sqrt(tot);
				System.out.println("Area of the Triangle: "+Area);
			}
				else
					System.out.println("Wrong entry");		
		}break;
		
		default:
			System.out.println("Invalid Input");
		}

	}

}
