import java.io.*;
import java.util.*;
import java.util.stream.*;

class MyCode {
  public static void main (String[] args) {
    List<Integer> l = new ArrayList<Integer>();
    l.add(1);
    l.add(2);
    l.add(10);
    l.add(20);
    l.add(5);
    l.add(34);
    List<Integer> result = getRandomSet(l);
    System.out.println("Random list is: " + result);
  }

  
  public static List<Integer> getRandomSet(List<Integer> l)
  {
    int n = l.size();
    Random r = new Random();
    int setSize = r.nextInt(n);
     System.out.println(setSize);
    Set<Integer> s = new HashSet<Integer>();
    Integer index = 0;
    for(int i=0; i <= setSize; i++)
    {
    
      //generate random indexes between 0 and n O(setSize)
        index = r.nextInt(setSize);
        s.add(index);
    }
    //filter out values from random indexes from the parameter list and add them to the result list
    //O(setSize) because access to set of filtered indexes is O(1) and access to each element in the list is O(1)
    return IntStream.range(0, setSize)
             .filter(i -> s.contains(i))
             .mapToObj(l::get)
             .collect(Collectors.toList());
  }
}
