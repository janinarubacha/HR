import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         String input = scan.nextLine();
        
        if(allUnique(input))
        {
            System.out.println("Yes");
        }
        else
        {
    		System.out.println("No");
        }
    }
    
    public static boolean allUnique(String s)
    {
        boolean[] alphabet = new boolean[256];
        String ss = s.replaceAll("[^a-zA-Z]","");
        if(ss.length() > 256) return false;
        for(int i=0; i < ss.length(); i++)
        {
            if(alphabet[(int)ss.charAt(i)])  return false;
               alphabet[(int)ss.charAt(i)] = true;
        }
        return true;       
    }
}
