//FahToCel
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sr = new Scanner(System.in);
		int F = sr.nextInt();
		int cel = (F - 32) * 5 / 9;
		System.out.println(cel);
	}
}
