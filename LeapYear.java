import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
    System.out.print("Please enter a year to check whether it is leap year or not:  ");    
	double useryear=sc.nextDouble();
     int roundyear=Math.abs((int)Math.round(useryear));
//     System.out.println(roundyear);
     
     boolean leapyear=false;
     if(roundyear % 100 == 0)
    	 leapyear=true;
     else if((roundyear % 4 ==0) && (roundyear % 100 != 0))
    	 leapyear=true;
      
     
    if (leapyear)
    	System.out.println(roundyear + " is a leap year");
    else
    	System.out.println(roundyear + " is not a leap year");
    
  
  }

}

