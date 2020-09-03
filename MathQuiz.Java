import java.util.Scanner;
import java.util.Random;
public class LoopRepeat {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		Random rand=new Random();
		int counter=0,continues=0;
		String correctanswer="";
		do
		{
		for (int i=1; i<=6;i++) 
		{
		int rand1= rand.nextInt(101);
		int rand2= rand.nextInt(101);
		System.out.print(rand1 + " + " + rand2 + " = ");
		int useranswer=input.nextInt();
		if(rand1 + rand2 == useranswer)
		{
			System.out.println("Correct!!");
			counter++;
		}
		else
		{
			System.out.println("Incorrect!!");
			
		}
		correctanswer +=rand1 + " + " + rand2 + " = " + (rand1+rand2) + "\n" ;
	}
		System.out.println("You had " + counter + " answers correct out of 6 quetions");
		System.out.println(correctanswer);
		System.out.println("Do you want play more if yes press any button to continue or press -1 for exit");
		continues=input.nextInt();
}while(continues != -1);
}
}
