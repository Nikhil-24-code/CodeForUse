import java.util.*;
public class DupTrick {
	public static void main(String ags[])
	{
		int i,j;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		/*System.out.print("Unsorted array input"+" ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();*/
		for(i=0;i<n;i++)
		{
			int c=0;
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			if(c>0)
				System.out.print(a[i]+" ");
					}
}
	
}

