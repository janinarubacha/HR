import java.io.*;

class MyCode {
  public static void main (String[] args) {
    System.out.println("Hello Java");
    System.out.println("Compress: " + compress("Hola"));
    System.out.println("compress: " + compress("a"));
    System.out.println("compress: " + compress(null));
    System.out.println("Compress: " + compress(""));
    System.out.println("Compress: " + compress("hhhhhhaaaaab"));
    System.out.println("Compress: " + compress("abcccccddde"));
  }
  
  
  public static String compress(String s)
  {
    if(s == null || s.isEmpty()) return s;
    StringBuilder c = new StringBuilder();
    int count = 0;
    char previous = '\0';
    for(int i = 0; i < s.length(); i++)
    {
      if(previous == '\0')
      {
        previous = s.charAt(i); 
      }
      if(s.charAt(i) == previous)
      {
        count++;
      }
      if(s.charAt(i) != previous)
      {
        c.append(previous);
        c.append(count+1);
        count = 0;
        previous = s.charAt(i);
      }

    }
    c.append(previous);
    c.append(count+1);
    if(c.length() >= s.length()) return s;
    return c.toString();
    
  }
}
