import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        	Scanner sr=new Scanner(System.in);
                int n=sr.nextInt();
                int [] a= new int[n];	
                int count=0;
                for(int i=0;i<n;i++){
                        a[i]=sr.nextInt();
                }
                
                for(int i=0; i<a.length;i++){
                        if(a[i]>=a[0]){
                                count++;
                        }
                }
                
                System.out.println(count);
        }
}
