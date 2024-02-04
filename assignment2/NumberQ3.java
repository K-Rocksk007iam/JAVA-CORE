package assignment2;
import java.util.Scanner;
public class NumberQ3 
{
	private int numOne;
	private int numTwo;
	private int result;
	Scanner sc=new Scanner(System.in);
	public void acceptNumbers()
	{
		
		numOne=sc.nextInt();
		numTwo=sc.nextInt();
	}
	public void total()
	{
		result=numOne+numTwo;
		System.out.println("result="+result);
	}
}
