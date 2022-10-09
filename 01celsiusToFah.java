import java.util.*;
import java.lang.*;
import java.io.*;

public class celsiusToFah {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int celsius = sr.nextInt();
        int fahrenheit = celsius;
        fahrenheit = fahrenheit * 9;
        fahrenheit = fahrenheit / 5;
        fahrenheit = fahrenheit + 32;
        System.out.println(fahrenheit); // After Converting 
    }
}
