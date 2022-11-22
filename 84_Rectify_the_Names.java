
/*
 * Ram is the class representative and he has been given the class list by his
 * teacher
 * and has been asked to make sure the names of all the students are correct.
 * 
 * He notices that some names have random capitalization in the letters.
 * 
 * He decides to write a piece of code to capitalize only the first letter
 * of each word in the name. Can you help Ram in achieving his goal?
 * Input:
 * rAm AroRa
 * Output:
 * Ram Arora
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        char[] charArray = str.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);

                if (foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);

                    foundSpace = false;

                }
            } else {
                foundSpace = true;
            }
        }
        str = String.valueOf(charArray);
        System.out.println(str);
    }

}
