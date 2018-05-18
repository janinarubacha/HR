import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
        int bitVector = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int pos = (int)s.charAt(i);
            if((bitVector | 1 << pos) == bitVector)
            {
                //unset bit
                bitVector = bitVector & ~(1 << pos);
            }
            else
            {
                //set bit
                bitVector = bitVector | (1 << pos);
            }
        }
        if(bitVector == 0) return "YES";
        if((bitVector & (bitVector -1)) == 0) return "YES";
        return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
