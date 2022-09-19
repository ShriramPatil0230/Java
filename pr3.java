import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sr=new Scanner(System.in);
  int n=sr.nextInt();
  int sum=0;
  int copyn=n;
/*  while(n!=0)
  {
    int digit=n%10;
    sum=sum+ (digit+digit+digit);
    n=n/10;
  }*/
  for(int copyn=n;copyn!=0;copyn=copyn/10)
    {
      int digit=copyn%10;
      sum=sum+(digit+digit+digit);
    }
  if(sum==n)
  {
    	System.out.println(1);
  }
  else
  {
    	System.out.println(0);
  }
	}
}