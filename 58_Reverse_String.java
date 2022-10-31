import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
	    
	    String str  = in.next();
                String nstr="";
                char ch;
	  for (int i=0; i<str.length(); i++)
              {
                ch= str.charAt(i); //extracts each character
                nstr= ch+nstr; //adds each character in front of the existing string
              }
              System.out.println(nstr);
    }

}
