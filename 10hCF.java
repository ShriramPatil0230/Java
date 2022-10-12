import java.util.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		int minimumOfTwo = Math.min(a,b); // (a<b) ? a:b
		
		int hcf = 1;
		// Operations = Minimum of a and b 
		for(int i=2;i<=minimumOfTwo;i++)
		{
		    if(a%i==0 && b%i==0) // whether i divides both a and b 
		    {
		        hcf = i; // largest value of i obeying the if condition that will be stored 
		    }
		}
		
		System.out.println(hcf);
	}
}

