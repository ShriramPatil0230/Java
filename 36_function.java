import java.util.*;

public class Main
{
    // public static int[] abc()
    // {
    //     int ans[] = new int[10];
        
    //     // logic 
        
    //     return ans;
    // }
    
    
    
    public static void FirstFunction()
    {
        int a = 10;
        // some part of code (Logic )
        // Logic part
        System.out.println(a+" First");
    }
    public static void SecondFunction()
    {
        int a = 5;
        // some part of code 
        FirstFunction();
        System.out.println(a + " Second");
    }
    public static void ThirdFunction()
    {
        // some part of code 
        SecondFunction();
        System.out.println("Third");
        FirstFunction();
    }
    
    // access_specifier static return_type function_name(parameter list (data_type name))
    // {
        
    // }
    
    public static void abc(int a,float b,int c)
    {
        System.out.println(a);
    }
    
    public static void abc(int a,int b,int c)
    {
        System.out.println(a);
    }
    
    public static void abc(int a,int b,String c)
    {
        // logic 
        a = 5;
        b = 10;
        
        int e = 10;
        System.out.println(c+", "+a+", "+b);
        return;
    }
    
    //execution starts from the main function 
	public static void main(String[] args) {
	    
	   // for(int i=0;i<args.length;i++)
	   // {
	   //     System.out.println(args[i]);
	   // }
	   
		
// 		ThirdFunction();
		
// 		int[] ans = abc(); //
        abc(100,150.0,784);

        abc(150,178,1478);
        String e = "SACHIN";
        abc(100,150,"VIRAT");
// 		System.out.println(ans);
		
		// reusablitily of code 
		// clearly understand the code 
		

// 		SecondFunction();
// 		ThirdFunction();
		
// 		// some code 
		
// 		FirstFunction();
		
// 		// some code 
		
// 		FirstFunction();
	}
}

