import java.util.*;
import java.lang.*;
import java.io.*;

public class BigLight {
{
	public static void main (String[] args)
	{
		Scanner sr= new Scanner(System.in);
                int h1= sr.nextInt();
                int h2= sr.nextInt();

                int s1= sr.nextInt();
                int s2= sr.nextInt();

                if(s1 == s2)
                {
                        System.out.println("false");
                }
                else{
                        int nume = (h2 - h1);
                        int deno = (s1 -s2);

                        if(nume % deno == 0)
			{
                                System.out.println("true");
                        }
                        else{
                                System.out.println("false");
                        }
                }
	}
}

}
