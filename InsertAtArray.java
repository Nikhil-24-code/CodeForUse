import java.util.*;
public class Insertion {
//insertion  in Array
	 public static void main(String[] args) 
	    {
	        int n, pos, x;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n+1];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        String ss="";
	        ss+=a[0];
	        System.out.println("Your entries");
	        for(int i = 1; i < n; i++)
	        {
	             ss+=  "," + a[i];
	        }
	        System.out.println(ss);
	        System.out.print("\nEnter the position where you want to insert element:");
	        pos = s.nextInt();
	        System.out.print("\nEnter the element you want to insert:");
	        x = s.nextInt();
	        for(int i = (n-1); i >= (pos-1); i--)
	        {
	            a[i+1] = a[i];
	        }
	        a[pos-1] = x;
	        System.out.print("\nAfter inserting:\t");
	        for(int i = 0; i < n; i++)
	        {
	            System.out.print(a[i]+",");
	        }
	        System.out.print(a[n]);
	    }
}
