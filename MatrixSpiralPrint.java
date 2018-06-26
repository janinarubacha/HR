// package whatever; // don't place package name!

import java.io.*;

class MyCode {
  public static void main (String[] args) {
    
    
    char[][] table = {"abc".toCharArray(),
                      "jkd".toCharArray(),
                      "ile".toCharArray(),
                      "hgf".toCharArray()};
 
    printSpiral(table);
    
    //null
    table = null;

    printSpiral(table);
//empty
    table = new char[0][0];

    printSpiral(table);
//only one element
    table = new char[][]{"a".toCharArray()};
    
    printSpiral(table);

//only one row
    table = new char[][]{"abcdefghijkl".toCharArray()};

    printSpiral(table);

//only one column
    table = new char[][]{{'a'},{'b'},{'c'},{'d'},{'e'},{'f'},{'g'},{'h'},{'i'},{'j'},{'k'},{'l'}};

    printSpiral(table);

//only one very long row
    table = new char[][]{"abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".toCharArray()};

    printSpiral(table);

//only one very long column
    table = new char[][]{{'a'},{'b'},{'c'},{'d'},{'e'},{'f'},{'g'},{'h'},{'i'},{'j'},{'k'},{'l'}
                  ,{'m'},{'n'},{'o'},{'p'},{'q'},{'r'},{'s'},{'t'},{'u'},{'v'},{'w'},{'x'}
                  ,{'y'},{'z'}};
    printSpiral(table);

    //only 2 columns and several rows
    table = new char[][]{"ab".toCharArray(), "cd".toCharArray(), "ef".toCharArray()
                  ,"gh".toCharArray(), "ij".toCharArray(), "kl".toCharArray()
                  ,"mn".toCharArray(), "op".toCharArray(), "qr".toCharArray()};
    printSpiral(table);
   
    //only 2 rows and several columns
    table = new char[][]{"abcdefghijkl".toCharArray(), "mnopqrstuvwx".toCharArray()};
    printSpiral(table);
    
    //square matrix
    table = new char[][]{"abc".toCharArray(), "def".toCharArray(), "ghi".toCharArray()};
    printSpiral(table);

  }
  
  public static void printSpiral(char[][] a)
  {
    
    if(a == null) return;
    
    int n = a.length;
    int m = 0;
    if (a.length > 0)
    {
      m = a[0].length;
    }
    
    int x;
    int y;
    
    for(int i=0; i< n && i < m; i++)
    {
      x = i;
      for(y=i; y < m - i; y++)
      {
        System.out.printf("%c%c", a[x][y], ',');
        
      }
      
      if(y == i) break;
      y = m - i - 1;
      
      for(x=i+1; x < n - i; x++)
      {
        System.out.printf("%c%c", a[x][y], ',');
        System.out.println();
       
      }
      
      if(x == i+1) break;
      
      x = n - i - 1;
      
      for(y=m-i-2; y >= i; y--)
      {
        System.out.printf("%c%c", a[x][y], ',');
        
      }
      if(y == m-i-2) break;
      
      y=i;
      for(x=n-2-i; x > i; x--)
      {
        System.out.printf("%c%c", a[x][y], ',');
        System.out.println();
        
      }
      if(x == n-2-i) break;
      
    }
    System.out.println("\n\n\n");
    
  }
}
