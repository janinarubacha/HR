// package whatever; // don't place package name!

import java.io.*;


class MyCode {
  public static void main (String[] args) {
    System.out.println("Hello Java");
    System.out.println(oneAway("Hol","Hola"));
    System.out.println(oneAway(null, null));
    System.out.println(oneAway("", null));
    System.out.println(oneAway(null, ""));
    System.out.println(oneAway("", ""));
    System.out.println(oneAway("hola", "adios"));
    System.out.println(oneAway("hola", ""));
    System.out.println(oneAway("hola", null));
    System.out.println(oneAway(null, "adios"));
    System.out.println(oneAway("", "adios"));
                       
  }

  
  public static boolean oneAway(String s1, String s2)
  {
    if(s1==null || s1.isEmpty() || s2==null || s2.isEmpty())
    {
      return false;
    }
  
    if(Math.abs(s1.length() - s2.length()) > 1) return false;
    
    if(s1.length() == s2.length())
    {
        return compareEqual(s1,s2);  
    }
    
    String longest = (s1.length() == s2.length() + 1)?s1:s2;
    String shortest = (s2.length() == s1.length() + 1 )?s1:s2;
    return compareNotEqual(longest,shortest);
    
  }
  
  static boolean compareEqual(String s1, String s2)
  {
    if(s1.length() != s2.length()) return false;
    if(s1.equals(s2)) return true;
    int replacements = 0;
    for(int i = 0; i < s1.length(); i++)
    {
      if(s1.charAt(i) != s2.charAt(i))
      {
        if(replacements > 0) return false;
        replacements++;
      }
      
    }
    return true;
  }
  
  
  static boolean compareNotEqual(String longest, String shortest)
  {
    
    if(longest.length() <= shortest.length()) return false;
    boolean diff = false;
    for(int i=0, j=0; i < shortest.length(); i++)
    {
      if(longest.charAt(i) == shortest.charAt(i))
      {
        j++;
      }
      else
      {
        if(diff) return false;
        diff = true;
      }
     
    }
    if(diff) return false;
    return true;
    
  }
  
}
