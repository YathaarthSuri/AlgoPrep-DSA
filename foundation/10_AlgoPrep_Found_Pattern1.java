import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
      Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        int nst = 1;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            System.out.println();
            nst++;
        }
      
    }
}
